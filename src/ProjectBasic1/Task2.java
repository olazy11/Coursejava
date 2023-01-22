package ProjectBasic1;
/*
2)Using Scanner create an array of countries. When an array is created,
        retrieve all values from it and while retrieving those values print capital
        for each country. (use 2 different loops).
*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter 5 countries");

        String[] countries = new String [5];
        countries [0] = input.next();
        countries [1] = input.next();
        countries [2] = input.next();
        countries [3] = input.next();
        countries [4] = input.next();

        System.out.println("Please enter capitals for these 5 countries");
        String[] capitals = new String[5];
        capitals[0] = input.next();
        capitals[1] = input.next();
        capitals[2] = input.next();
        capitals[3] = input.next();
        capitals[4] = input.next();

        for (int i = 0; i < countries.length; i++) {

            for (int j = 0; j < capitals.length; j++) {

                System.out.println("The country " + countries[i] + " has a capital " + capitals[j]);
                i++;
            }
        }
    }
}

