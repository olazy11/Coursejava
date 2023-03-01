package class30.Homework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Person {
    String name;
    String lastname;
    int age;
    double salary;

    public Person(String name, String lastname, int age, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    public void print () {
        System.out.println("Person name is " + name+ ", surname is "+ lastname+", age is "+ age + " and total salary amounts to " + salary);
    }
}
class Test {
    public static void main(String[] args) {
        Person boss = new Person("Vova","Vavilov", 67, 560.47);
        Person teamLead = new Person("Sergey", "Sergeev", 43, 400.2);
        Person engineer = new Person("Slava", "Slavin", 29, 200.1);
        Person trainee = new Person("Sasha", "Sashev", 22, 100.2);

        TreeMap<String, String> coworkers = new TreeMap<>();
        coworkers.put("1234","Boss");
        coworkers.put("1945","Team Lead");
        coworkers.put("0573", "Engineer");
        coworkers.put("7645", "Trainee");
        Set<Map.Entry<String,String>> object = coworkers.entrySet();
        for (Map.Entry<String,String> x :object) {
            System.out.println("Person ID - " + x.getKey() +" , person's position - "+ x.getValue());
        }
        boss.print();
        teamLead.print();
        engineer.print();
        trainee.print();










    }
}