package Reps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {
    public static void display() {
        Map<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        var entrySet =map.entrySet();
        for (var entry: entrySet) {
            if (!entrySet.isEmpty()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            } else {
                System.out.println("map is empty");
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
display();

        System.out.println("*******");
        map.clear();

       display();





    }
}
