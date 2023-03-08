package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExcelReaderDemo {
    public static void main(String[] args) throws IOException {
        String path ="C:\\Users\\olazy\\OneDrive\\Test3.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream); //a class that knows how to read and write data of Excel files
        Sheet sheet1 =xssfWorkbook.getSheet("Sheet1");
        Row row = sheet1.getRow(1);
        Cell cell = row.getCell(1);
        //all numbers in Excel are stored as doubles. row and cells are zero based index
        System.out.println(cell);
    }
}
