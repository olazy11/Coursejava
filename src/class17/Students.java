package class17;
/*Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
* */
public class Students {
    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name = "Gay";
        student1.ID = "IZ102";
        student1.numberOfStudents++;

        Students student2 = new Students();
        student2.name = "Gary";
        student2.ID = "IG106";
        student2.numberOfStudents++;

        Students student3 = new Students();
        student3.name = "Mary";
        student3.ID = "MIZ108";
        student3.numberOfStudents++;

        System.out.println(Students.numberOfStudents);
    }
}
