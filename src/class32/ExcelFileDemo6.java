package class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class ExcelFileDemo6 {


        public static void main(String[] args) throws IOException {
            String path = "files/Book1.xlsx";
            FileInputStream fileInputStream = new FileInputStream(path);
        /*
        A class that we can use to read and write data easily from Excel
        Files.
         */
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet2=xssfWorkbook.getSheet("Book1");
            int noOfRows=sheet2.getPhysicalNumberOfRows();
            System.out.println(noOfRows);
//generic, universal code for any sheet3

            List<Map<String,String>> excelData=new ArrayList<>();

            Row row0 =sheet2.getRow(0);//header part is extracted to be used later for all maps
            for (int i = 1; i < noOfRows; i++) {
                Row row = sheet2.getRow(i);
                LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();

                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                    rowMap.put(row0.getCell(j).toString(),row.getCell(j).toString());

                }


                /*rowMap.put("UserName",row.getCell(0).toString());
                rowMap.put("Password",row.getCell(1).toString())*/;
                excelData.add(rowMap);
            }

            System.out.println(excelData);

        }
    }





