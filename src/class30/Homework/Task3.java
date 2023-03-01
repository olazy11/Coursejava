package class30.Homework;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> emp = new LinkedHashMap<>();
        emp.put("Egor", 2000);
        emp.put("Max", 3000);
        emp.put("Olga", 5000);
int maxValue = Collections.max(emp.values());

for (Map.Entry<String,Integer> entry: emp.entrySet()){
           if (entry.getValue() ==maxValue){
               System.out.println(entry.getKey()+" = $"+entry.getValue());

           }
       }





    }
}