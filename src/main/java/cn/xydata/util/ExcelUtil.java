package cn.xydata.util;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Excel 工具类
 */
public class ExcelUtil {

    /**
     * 从指定路径读取Excel文件，返回类型为List<Map<String,String>>
     *
     * @param path
     * @throws IOException
     */
    public static ArrayList<Map<String, String>> readExcel(String path) throws Exception {
        ArrayList<Map<String, String>> mapList = new ArrayList<>();
        File file = new File(path);
        //判断文件是否存在
        if (file.isFile() && file.exists()) {
            System.out.println(file.getPath());
            //获取文件的后缀名 \\ .是特殊字符
            String[] split = file.getName().split("\\.");
            System.out.println(split[1]);
            Workbook wb;
            //根据文件后缀（xls/xlsx）进行判断
            if ("xls".equals(split[1])) {
//              //获取文件流对象
                FileInputStream inputStream = new FileInputStream(file);
                wb = new HSSFWorkbook(inputStream);
            }else if ("xlsx".equals(split[1])){
                wb = new XSSFWorkbook(file);
            }else {
                System.out.println("文件类型错误");
                return null;
            }

            //开始解析
            Sheet sheet = wb.getSheetAt(0);
            //第一行是列名，所以从第二行开始遍历
            int firstRowNum = sheet.getFirstRowNum() + 1;
            int lastRowNum = sheet.getLastRowNum();

            //遍历行
            for (int rIndex = firstRowNum; rIndex <= lastRowNum; rIndex++) {
                Map map =new HashMap();
                //获取当前行的内容
                Row row = sheet.getRow(rIndex);
                if (row != null) {
                    int firstCellNum = row.getFirstCellNum();
                    int lastCellNum = row.getLastCellNum();
                    for (int cIndex = firstCellNum; cIndex < lastCellNum; cIndex++) {
                        row.getCell(cIndex).setCellType(Cell.CELL_TYPE_STRING);
                        //获取单元格的值
                        String value = row.getCell(cIndex).getStringCellValue();
                        System.out.println(value);
                        //获取此单元格对应第一行的值
                        String key = sheet.getRow(0).getCell(cIndex).getStringCellValue();
                        System.out.println(key);
                        //第一行中的作为键，第n行的作为值
                        map.put(key, value);
                        System.out.println(map);
                    }
                }
                mapList.add(map);
                System.out.println("读取成功");
                System.out.println(mapList);
            }

        }

        return mapList;

    }

    /**
     * multipartFile转file
     * @param excelPath
     * @param multipartFile
     * @return
     * @throws Exception
     */
    public static File tranmultipartToFile(String excelPath,MultipartFile multipartFile) throws Exception {
        String fileName = UUID.randomUUID().toString().replace("-","");
        String fileSuffix = multipartFile.getOriginalFilename().substring(
                multipartFile.getOriginalFilename().indexOf('.') + 1, multipartFile.getOriginalFilename().length());
        File file = new File(excelPath + File.separator + fileName+"." + fileSuffix);
        multipartFile.transferTo(file);
        return file;
    }


    public static ArrayList<Map<String, String>> readExcel(File file) throws Exception {
        ArrayList<Map<String, String>> mapList = new ArrayList<>();
        if (file.isFile() && file.exists()) {
           // system.out.println(file.getPath());
            //获取文件的后缀名 \\ .是特殊字符
            String[] split = file.getName().split("\\.");
           // system.out.println(split[1]);
            Workbook wb;
            //根据文件后缀（xls/xlsx）进行判断
            if ("xls".equals(split[1])) {
//              //获取文件流对象
                FileInputStream inputStream = new FileInputStream(file);
                wb = new HSSFWorkbook(inputStream);
            }else if ("xlsx".equals(split[1])){
                wb = new XSSFWorkbook(file);
            }else {
                System.out.println("文件类型错误");
                return null;
            }

            //开始解析
            Sheet sheet = wb.getSheetAt(0);
            //第一行是列名，所以从第二行开始遍历
            int firstRowNum = sheet.getFirstRowNum() + 1;
            int lastRowNum = sheet.getLastRowNum();

            //遍历行
            for (int rIndex = firstRowNum; rIndex <= lastRowNum; rIndex++) {
                Map map =new HashMap();
                //获取当前行的内容
                Row row = sheet.getRow(rIndex);
                if (row != null) {
                    int firstCellNum = row.getFirstCellNum();
                    int lastCellNum = row.getLastCellNum();
                    for (int cIndex = firstCellNum; cIndex < lastCellNum; cIndex++) {
                        row.getCell(cIndex).setCellType(Cell.CELL_TYPE_STRING);
                        //获取单元格的值
                        String value = row.getCell(cIndex).getStringCellValue();
                       // system.out.println(value);
                        //获取此单元格对应第一行的值
                        String key = sheet.getRow(0).getCell(cIndex).getStringCellValue();
                       // system.out.println(key);
                        //第一行中的作为键，第n行的作为值
                        map.put(key, value);
                       // system.out.println(map);
                    }
                }
                mapList.add(map);
               // system.out.println("读取成功");
               // system.out.println(mapList);
            }

        }

        return mapList;

    }

    public static void createExcel(ArrayList<String> list) {
        //获取当前时间
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳

        //存储路径--获取桌面位置
        FileSystemView view = FileSystemView.getFileSystemView();
        File directory = view.getHomeDirectory();
        System.out.println(directory);
        //存储Excel的路径
        String path = directory+"\\"+date+".xlsx";
        System.out.println(path);
        try {

            //定义一个Excel表格
            XSSFWorkbook wb = new XSSFWorkbook();  //创建工作薄
            XSSFSheet sheet = wb.createSheet("sheet1"); //创建工作表
            XSSFRow row = sheet.createRow(0); //行
            XSSFCell cell;  //单元格

            //添加表头数据
            for (int i = 0; i < list.size(); i++) {
                //从前端接受到的参数封装成list集合，然后遍历下标从而取出对应的值
                String value = list.get(i);
                //将取到的值依次写到Excel的第一行的cell中
                row.createCell(i).setCellValue(value);
            }

            //输出流,下载时候的位置
//            FileWriter outputStream1 = new FileWriter(path);
            FileOutputStream outputStream = new FileOutputStream(path);
            wb.write(outputStream);
            outputStream.flush();
            outputStream.close();
            System.out.println("写入成功");
        } catch (Exception e) {
            System.out.println("写入失败");
            e.printStackTrace();
        }
    }

}