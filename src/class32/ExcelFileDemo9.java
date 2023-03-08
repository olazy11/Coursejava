package class32;

import utils.ExcelReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo9 {
    public static void main(String[] args) throws IOException {
        List<Map<String, String>> excelData = ExcelReader.read();

        for (Map<String,String>row:excelData){
            for (var entry :row.entrySet()){
                System.out.println(entry.getKey() + " "+entry.getValue());
            }
            System.out.println("***************");
        }










       /* System.out.println(excelData);
        Map<String,String> firstRow = excelData.get(0);
        System.out.println(firstRow.get("Name"));*/
    }
}
