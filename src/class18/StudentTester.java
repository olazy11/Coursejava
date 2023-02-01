package class18;

public class StudentTester {
    public static void main(String[] args) {

        Student student1 = new Student("Mike", "34D", 20, 25.2);
        student1.printInfo();
        Student student2 = new Student("Olga", "DS2", 28, 27.1);
        student2.printInfo();
        Student student3 = new Student("Lena", "L00", 40, 28.0);
        student3.printInfo();

        Student student4 = new Student("Pisa", "L02");
        student4.printInfo();
    }

}
