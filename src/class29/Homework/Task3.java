package class29.Homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*Create a Set collection that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID.
Display name of each student.
* */
public class Task3 {
    public static void main(String[] args) {
        Map<  Integer, String> studentMap=new HashMap<>();
        studentMap.put(1123,"John");
        studentMap.put(4015,"Jason");
        studentMap.put( 6051,"Jordan");
        studentMap.put(4908,"Jenny");

        System.out.println(studentMap.get(1123));
        System.out.println(studentMap.get(4015));
        System.out.println(studentMap.get(6051));
        System.out.println(studentMap.get(4908));

    }
}
