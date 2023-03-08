package class32;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {
    String path = "./files/ExcelTest.xlsx";

    FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet2 = xssfWorkbook.getSheet("Sheet2");
int noOfRows = sheet2.getPhysicalNumberOfRows();
        System.out.println(noOfRows);

        for (int i = 1; i < noOfRows; i++) {
            Row row =sheet2.getRow(i);

            int noOfcells = row.getPhysicalNumberOfCells();
            for (int j = 0;j < noOfcells; j++) {
                System.out.println(row.getCell(j)+" ");

            }
            System.out.println();



            System.out.println(row.getCell(0)+ " "+ row.getCell(1));


        }

    }
}
