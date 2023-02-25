package class28.Homework;

import java.util.ArrayList;

/*4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

 * */
public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Vodka");
        drinks.add("Juice");
        drinks.add("Beer");
        drinks.add("Milk");
        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a") ||drinks.get(i).contains("e")  ){
               drinks.set (i, "Water");
            }
        }
        System.out.println(drinks);
    }
}