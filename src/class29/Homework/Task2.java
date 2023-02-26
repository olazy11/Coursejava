package class29.Homework;

import java.util.TreeSet;

/*Create a Set of cities in which you want to make sure that insertion order is maintained.
 Then remove any city that starts with “A”;

* */
public class Task2 {
    public static void main(String[] args) {


        TreeSet<String> cities = new TreeSet<>();
        cities.add ("Milan");
        cities.add ("Astrakhan");
        cities.add ("Kaliningrad");
        cities.add ("London");

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);

    }
}