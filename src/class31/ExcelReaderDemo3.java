package class31;

import java.util.*;

public class ExcelReaderDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> row1 = new LinkedHashMap<>();
        row1.put("Name", "Hamid");
        row1.put("age", "33");
        row1.put("City", "San Roman");
        row1.put ("salary","120000");

        LinkedHashMap<String,String> row2 = new LinkedHashMap<>();
        row2.put("Name", "Sam");
        row2.put("age", "60");
        row2.put("City", "Houston");
        row2.put ("salary","125000");

        LinkedHashMap<String,String> row3 = new LinkedHashMap<>();
        row3.put("Name", "Fayed");
        row3.put("age", "45");
        row3.put("City", "Alexandria");
        row3.put ("salary","129000");

 List<Map<String,String>> allrows = new ArrayList<>();
 allrows.add(row1);
 allrows.add(row2);
 allrows.add(row3);
        System.out.println(allrows);



    }
}
