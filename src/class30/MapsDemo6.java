package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo6 {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Nazir");
        studentsMap.put(2, "Shan");
        studentsMap.put(3, "Tami F");
        studentsMap.put(4, "Aisha");

        Set<Map.Entry<Integer, String>> entrySet = studentsMap.entrySet();
        for (Map.Entry<Integer, String> entry: entrySet ) {
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
entrySet.removeIf(x->x.getKey()>2 && x.getValue().contains("i"));
        System.out.println(studentsMap);


    }
}