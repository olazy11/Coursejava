package class18.Homework;

import class17.Student;

public class StudentTester {
    public static void main(String[] args) {
        Students student1 = new Students("Bob", 2,3,5  );
        student1.calculateAverageGrade();
        student1.getInfo();
        Students student2 = new Students("Clara", 3,5,1);
        student2.calculateAverageGrade();
        student2.getInfo();
        Students student3 = new Students("Peter", 3, 5,4);
        student3.calculateAverageGrade();
        student3.getInfo();
        Students student4 = new Students("Zara", 3,2,1);
        student4.calculateAverageGrade();
        student4.getInfo();
        Students student5 = new Students("Pop", 5,5,5);
        student5.calculateAverageGrade();
        student5.getInfo();
    }
}
