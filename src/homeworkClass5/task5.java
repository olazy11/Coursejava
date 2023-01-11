package homeworkClass5;

import java.util.Scanner;

/*
Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
 */
public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("What is your city");
        String city = input.next();

        System.out.println("What is the temperate there?");
        int temp = input.nextInt();
        //отнять 32, потом умножить на 5 и разделить на 9.
        double convtemp= (temp - 32)*5/9;
        System.out.println("The temperature is the city " + city +" is " + convtemp);

    }
}
