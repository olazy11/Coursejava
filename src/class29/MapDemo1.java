package class29;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {


        Map<Integer, String> studentsMap = new HashMap<>();//fast, work based on the keys  not index
        studentsMap.put(1, "Nazir");
        studentsMap.put(2, "Shan");
        studentsMap.put(3, "Tami F");
        studentsMap.put(4, "Aisha");
        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(3)); //first -key
        System.out.println(studentsMap.containsValue("Shan")); //second-value
        System.out.println(studentsMap.remove(1));//removes entire entry using key
        System.out.println(studentsMap.remove(2,"Shan"));
        System.out.println(studentsMap);
        studentsMap.replace(3, "Asli");//replaces Tami with Asli
        System.out.println(studentsMap);
    }
}