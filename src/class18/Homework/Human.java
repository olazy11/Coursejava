package class18.Homework;
/*Write a java class that will have a constructor: one with parameters and second without any parameters.
Create a separate Test class where you will execute both of the constructors 1 by 1.
* */
public class Human {
    String name;
    int age;

    public Human (String humName, int humAge) {
        name = humName;
        age = humAge;
    }

    public Human() {

    }

    void printInfo() {
        System.out.println("Task1 name is " + name + " and age is " + age);
    }
}
