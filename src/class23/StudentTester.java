package class23;

public class StudentTester {
    public static void main(String[] args) {

       Student [] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent() };
       for (Student x: students) {
           x.study();

       }
    }
}
