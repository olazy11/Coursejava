package class28.Homework;

import java.util.ArrayList;

/*2)Create an arraylist of cars and retrieve all the values using 3 different ways.

 * */
public class Task2 {
    public static void main(String[] args) {
        ArrayList <String> car = new ArrayList<>();
        car.add("Volvo");
        car.add("BMW");
        car.add ("VW");
        car.add ("Nissan");
        car.add ("Toyota");
        System.out.println(car);

        for(String c:car) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.print(car.get(0)+" "+car.get(1)+" "+car.get(2)+" "+car.get(3)+" "+car.get(4));
    }
}
