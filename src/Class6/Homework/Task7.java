package Class6.Homework;

import java.util.Scanner;

/*
* Ask user to enter their country and capture it. Once values are captured print which language user speaks.

*/
public class Task7 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please, enter your country: Spain, Russia, UK, Netherlands, Denmark");
        String country = input.nextLine();

        if (country.equalsIgnoreCase("Spain")) {
             System.out.println("You speak Spanish");}
             if (country.equalsIgnoreCase("Russia")) {
                 System.out.println("You speak Russian");}
                 if (country.equalsIgnoreCase("UK")){
                     System.out.println("You speak English");}
                     if (country.equalsIgnoreCase("Netherlands")){
                         System.out.println("You speak Dutch");}
                         if (country.equalsIgnoreCase("Denmark")){
                             System.out.println("You speak Danish");}
                         }
                     }






