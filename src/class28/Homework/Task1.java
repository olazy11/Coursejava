package class28.Homework;

import java.util.ArrayList;

/*1) Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that

 * */
public class Task1 {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Olga");
        names.add("Milan");
        names.add ("Ira");
        names.add ("Tanya");
        names.add ("Natasha");
        if (names.isEmpty()) {
            System.out.println("The ArrayList is empty");
        }else{
            System.out.println("The ArrayList is not empty");
        }
        if (names.contains("Olga")) {
            System.out.println("The ArrayList contains my name");
        }
        System.out.println(names.size() );
        System.out.println(names);
    }
}
