package class20.Homework;
/*Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!
* */
public class Employee {
   static int classCounter;
    String firstname;
    String surname;
    int age;
    String position;

    Employee(String firstname, String surname, int age, String position) {
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
        this.position = position;
    }

    void showInfo() {
        System.out.println("Employee's details: " + firstname + " " + surname + " " + age + " " + position);
    }

    static int getNo() {
        classCounter++;
        return classCounter;
    }
}

    class FulltimeEmployee extends Employee {
        String gender;

        FulltimeEmployee(String firstname, String surname, int age, String position, String gender) {
            super(firstname, surname, age, position);
            this.gender = gender;
        }

        void ifOld() {
            if (age > 50) {
                System.out.println("Full-time employee is to old to spend all days in the office");
            } else {
                System.out.println("Work,work,work! while you are young");
            }
        }
    }


    class Tester extends FulltimeEmployee {
        boolean ifgood;

        Tester(String firstname, String surname, int age, String position, String gender, boolean ifgood) {
            super(firstname, surname, age, position, gender);
            this.ifgood = ifgood;
        }

        void goodOrBad() {
            System.out.println("Employee tester is good to people " + ifgood);
        }
    }


    class ParttimeEmployee extends Employee {
        double salary;

        ParttimeEmployee(String firstname, String surname, int age, String position, double salary) {
            super(firstname, surname, age, position);
            this.salary = salary;
        }

        void showNo() {
            System.out.println(super.getNo());
        }

    }








