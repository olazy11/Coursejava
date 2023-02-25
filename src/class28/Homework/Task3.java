package class28.Homework;

import java.util.ArrayList;

/*3)Create an arrayList of words. Remove every word that ends with “e”.

 * */
public class Task3 {
    public static void main(String[] args) {
        ArrayList <String> words = new ArrayList<>();
        words.add("apple");
        words.add("ball");
        words.add ("table");
        words.add ("chess");
        words.removeIf(x -> x.endsWith("e"));

        System.out.println(words);
    }
}