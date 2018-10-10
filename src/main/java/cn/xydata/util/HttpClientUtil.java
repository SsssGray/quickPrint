package cn.xydata.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

public class HttpClientUtil {

    public static String requestRead(HttpServletRequest request)
    {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder("");
        try
        {
            br = request.getReader();
            String str;
            while ((str = br.readLine()) != null)
            {
                sb.append(str);
            }
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (null != br)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }


    public static String httpGet(String url) {
        try {
            String content = null;//网页内容
            int socketTimeout = 15000;//读取数据超时
            int connectTimeout = 15000;//链接超时
            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(connectTimeout)
                    .setConnectionRequestTimeout(connectTimeout)
                    .setSocketTimeout(socketTimeout).build();
            CloseableHttpClient httpClient = HttpClientBuilder.create()
                    .setDefaultRequestConfig(config).build();

            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
            HttpResponse response = httpClient.execute(httpGet);

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                content = EntityUtils.toString(entity, "UTF-8");
                EntityUtils.consume(entity);//关闭内容流
            }
            //释放链接
            httpClient.close();
            return content;
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.getMessage();
        }
    }

    public static String httpGet(String url,Map<String,String> headerMap) {
        try {
            String content = null;//网页内容
            int socketTimeout = 45000;//读取数据超时
            int connectTimeout = 45000;//链接超时


            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(connectTimeout)
                    .setConnectionRequestTimeout(connectTimeout)
                    .setSocketTimeout(socketTimeout).build();
            CloseableHttpClient httpClient = HttpClientBuilder.create()
                    .setDefaultRequestConfig(config).build();

            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
            if(null!=headerMap){
                for(Map.Entry<String,String> x:headerMap.entrySet()){
                    httpGet.setHeader(x.getKey(),x.getValue());
                }
            }

            HttpResponse response = httpClient.execute(httpGet);

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                content = EntityUtils.toString(entity, "UTF-8");
                EntityUtils.consume(entity);//关闭内容流
            }
            //释放链接
            httpClient.close();
            return content;
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.getMessage();
        }
    }

    public static String httpGet(String url,Map<String,String> headerMap,String ip) {
        try {
            String content = null;//网页内容
            int socketTimeout = 15000;//读取数据超时
            int connectTimeout = 15000;//链接超时
            String[] ips = ip.split(":");
            HttpHost httpHost = new HttpHost(ips[0],Integer.parseInt(ips[1]));
            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(connectTimeout)
                    .setConnectionRequestTimeout(connectTimeout)
                    .setProxy(httpHost)
                    .setSocketTimeout(socketTimeout).build();
            CloseableHttpClient httpClient = HttpClientBuilder.create()
                    .setDefaultRequestConfig(config).build();

            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
            if(null!=headerMap){
                for(Map.Entry<String,String> x:headerMap.entrySet()){
                    httpGet.setHeader(x.getKey(),x.getValue());
                }
            }

            HttpResponse response = httpClient.execute(httpGet);

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                content = EntityUtils.toString(entity, "UTF-8");
                EntityUtils.consume(entity);//关闭内容流
            }
            //释放链接
            httpClient.close();
            return content;
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.getMessage();
        }
    }

    public static String httpPost(String url,String postData,Map<String,String> headerMap){
        try {
            String content = null;
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost httpost = new HttpPost(url);
            httpost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
            //设置参数
            if(null!=headerMap){
                for(Map.Entry<String,String> x:headerMap.entrySet()){
                    httpost.setHeader(x.getKey(),x.getValue());
                }
            }

            // 构建消息实体
            StringEntity postEntity = new StringEntity(postData, Charset.forName("UTF-8"));
            postEntity.setContentEncoding("UTF-8");
            try{
                JSONObject jsonObject = JSONObject.parseObject(postData);
                postEntity.setContentType("application/json; charset=UTF-8");
            }
            catch (Exception e){
                postEntity.setContentType("application/x-www-form-urlencoded; charset=UTF-8");
            }
            // 发送Json格式的数据请求
            httpost.setEntity(postEntity);

            //执行请求
            HttpResponse response = httpClient.execute(httpost);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                content = EntityUtils.toString(entity, "UTF-8");
                EntityUtils.consume(entity);//关闭内容流
            }
            //释放链接
            httpClient.close();
            return content;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    public static String httpPost(String url,String postData,Map<String,String> headerMap,String ip){
        try {
            String content = null;
            String[] ips = ip.split(":");
            HttpHost httpHost = new HttpHost(ips[0],Integer.parseInt(ips[1]));
            RequestConfig config = RequestConfig.custom().setProxy(httpHost).build();
            CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();

            HttpPost httpost = new HttpPost(url);
            httpost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
            //设置参数
            if(null!=headerMap){
                for(Map.Entry<String,String> x:headerMap.entrySet()){
                    httpost.setHeader(x.getKey(),x.getValue());
                }
            }

            // 构建消息实体
            StringEntity postEntity = new StringEntity(postData, Charset.forName("UTF-8"));
            postEntity.setContentEncoding("UTF-8");
            try{
                JSONObject jsonObject = JSONObject.parseObject(postData);
                postEntity.setContentType("application/json; charset=UTF-8");
            }
            catch (Exception e){
                postEntity.setContentType("application/x-www-form-urlencoded; charset=UTF-8");
            }
            // 发送Json格式的数据请求
            httpost.setEntity(postEntity);

            //执行请求
            HttpResponse response = httpClient.execute(httpost);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                content = EntityUtils.toString(entity, "UTF-8");
                EntityUtils.consume(entity);//关闭内容流
            }
            //释放链接
            httpClient.close();
            return content;
        } catch (Exception e) {
            return e.getMessage();
        }
    }

}
