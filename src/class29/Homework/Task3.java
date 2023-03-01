package class29.Homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*Create a Set collection that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID.
Display name of each student.
* */
public class Task3 {
    public static void main(String[] args) {

       /*HashSet <Student> stNames = new HashSet<>();*/
       Set<Student> stNames = new HashSet<>(); //we can achieve polymorphism
        stNames.add(new Student("John", 1245));
        stNames.add(new Student("Jason", 1234));
        stNames.add(new Student("Jordan", 5682));
        stNames.add(new Student("Jenny", 6895));

for (Student x: stNames) {
    System.out.println(x.getName());
}
    }
}
    class Student {
       private String name;
       private int studentID;

        public Student(String name, int studentID) {
            this.name = name;
            this.studentID = studentID;
        }
public String getName(){
            return name;
}
    }

