package cn.xydata.util;


import cn.xydata.config.CustomException;
import cn.xydata.dto.WeatherDto;
import com.alibaba.fastjson.JSONObject;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XmlUtil {
    /**
     * xml文档Document转对象
     * @param document
     * @param clazz
     * @return
     */
    public static Object getObject(Document document,Class<?> clazz) {
        Object obj=null;
        //获取根节点
        Element root = document.getRootElement();
        try {
            obj=clazz.newInstance();//创建对象
            List<Element> properties=root.elements();
            for(Element pro:properties){
                try {
                    //获取属性名(首字母大写)
                    String propertyname=pro.getName();
                    propertyname = propertyname.substring(0,1).toUpperCase()+propertyname.substring(1,propertyname.length());
                    String propertyvalue=pro.getText();
                    Method m = obj.getClass().getMethod("set"+propertyname,String.class);
                    m.invoke(obj,propertyvalue);
                }
                catch (Exception e){

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    /**
     * xml字符串转对象
     * @param xmlString
     * @param clazz
     * @return
     */
    public static Object getObject(String xmlString,Class<?> clazz) {
        Document document=null;
        try {
            document = DocumentHelper.parseText(xmlString);
        } catch (DocumentException e) {
            throw new CustomException("获取Document异常"+xmlString);
        }      //获取根节点
        return getObject(document,clazz);
    }
    /**
     * 对象转xml文件
     * @param b
     * @return
     */
    public static Document getDocument(Object b) {
        Document document = DocumentHelper.createDocument();
        try {
// 创建根节点元素
            Element root = document.addElement(b.getClass().getSimpleName());
            Field[] field = b.getClass().getDeclaredFields(); // 获取实体类b的所有属性，返回Field数组
            for (int j = 0; j < field.length; j++) { // 遍历所有有属性
                String name = field[j].getName(); // 获取属属性的名字
                if (!name.equals("serialVersionUID")) {//去除串行化序列属性
                    name = name.substring(0, 1).toUpperCase()
                            + name.substring(1); // 将属性的首字符大写，方便构造get，set方法
                    Method m = b.getClass().getMethod("get" + name);
// System.out.println("属性get方法返回值类型:" + m.getReturnType());
                    String propertievalue = (String) m.invoke(b);// 获取属性值
                    Element propertie = root.addElement(name);
                    propertie.setText(propertievalue);
                }
            }


        } catch (Exception e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

        return document;
    }

    /**
     * 对象转xml格式的字符串
     * @param b
     * @return
     */
    public static String getXmlString(Object b){
        return getDocument(b).asXML();
    }


    /**
     * XML格式字符串转换为Map
     *
     * @param strXML XML字符串
     * @return XML数据转换后的Map
     * @throws Exception
     */
    public static Map<String, String> xmlToMap(String strXML) throws Exception {
        try {
            Map<String, String> data = new HashMap<String, String>();
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            InputStream stream = new ByteArrayInputStream(strXML.getBytes("UTF-8"));
            org.w3c.dom.Document doc = documentBuilder.parse(stream);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getDocumentElement().getChildNodes();
            for (int idx = 0; idx < nodeList.getLength(); ++idx) {
                Node node = nodeList.item(idx);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    org.w3c.dom.Element element = (org.w3c.dom.Element) node;
                    data.put(element.getNodeName(), element.getTextContent());
                }
            }
            try {
                stream.close();
            } catch (Exception ex) {
                // do nothing
            }
            return data;
        } catch (Exception ex) {
            throw ex;
        }

    }

    /**
     * 将Map转换为XML格式的字符串
     *
     * @param data Map类型数据
     * @return XML格式的字符串
     * @throws Exception
     */
    public static String mapToXml(Map<String, String> data) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder= documentBuilderFactory.newDocumentBuilder();
        org.w3c.dom.Document document = documentBuilder.newDocument();
        org.w3c.dom.Element root = document.createElement("xml");
        document.appendChild(root);
        for (String key: data.keySet()) {
            String value = data.get(key);
            if (value == null) {
                value = "";
            }
            value = value.trim();
            org.w3c.dom.Element filed = document.createElement(key);
            filed.appendChild(document.createTextNode(value));
            root.appendChild(filed);
        }
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        DOMSource source = new DOMSource(document);
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        transformer.transform(source, result);
        String output = writer.getBuffer().toString(); //.replaceAll("\n|\r", "");
        try {
            writer.close();
        }
        catch (Exception ex) {
        }
        return output;
    }

    public static void main(String[] args) throws Exception{
        String html = HttpClientUtil.httpGet("http://flash.weather.com.cn/wmaps/xml/ningbo.xml").replace("dn=\"day\"","");
        WeatherDto weatherDto = new WeatherDto();
        weatherDto.setCenterName(RegexUtil.stringRegex(html,"centername=\"(.*?)\""));
        weatherDto.setStateDetailed(RegexUtil.stringRegex(html,"stateDetailed=\"(.*?)\""));
        weatherDto.setTemNow(RegexUtil.stringRegex(html,"temNow=\"(.*?)\""));
        weatherDto.setImgUrl("/weather/day/"+weatherDto.getStateDetailed()+".png");
        System.out.println(JSONObject.toJSONString(weatherDto));
    }
}


