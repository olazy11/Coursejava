package class28.Homework;

import java.util.ArrayList;

/*5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.

 * */
public class Task5 {
    public static void main(String[] args) {
        ArrayList <Integer> evenNumbers = new ArrayList<>();

        for (int i = 1; i <= 500; i++) {
            if (i% 5 != 0) {
                evenNumbers.add(i);
            }
        }
        System.out.print(evenNumbers);
    }
}



