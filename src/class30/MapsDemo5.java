package class30;

import java.util.*;

public class MapsDemo5 {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();//fast, work based on the keys  not index
        studentsMap.put(1, "Nazir");
        studentsMap.put(2, "Shan");
        studentsMap.put(3, "Tami F");
        studentsMap.put(4, "Aisha");

        Set<Integer> keys = studentsMap.keySet();//it has replace method?/or Collection since it is a parent//removers KEYS
        keys.removeIf(x -> x>2);//it will remove these entries from studentsMap Map
        /*System.out.println(keys);*/
        /*System.out.println(studentsMap);*/

        Collection <String> values = studentsMap.values();///removes VALUES
        /*System.out.println(values);*/

        values.removeIf(x ->x.contains("i"));
       /* System.out.println(studentsMap);*/

        for (Integer x: keys){
            keys.removeIf(s -> s >2);
        }
            for (String a: values){
                values.removeIf(x ->x.contains("i"));
        }

            System.out.println(studentsMap);



    }
}
