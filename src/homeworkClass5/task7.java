package homeworkClass5;

import java.util.Scanner;

/*
Write a program to ask user to enter numbers of worked years and annual salary.
If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
 */
public class task7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many years have you worked?");
        int years = input.nextInt();
        if (years >= 5) {
            System.out.println("You are eligible for a bonus");

            System.out.println("What is you annual salary?");
            int salary = input.nextInt();
            if (salary > 5000) {
                System.out.println("Your bonus is 5000");
            } else {
                System.out.println("your bonus is 3000");
            }
        } else {
            System.out.println("You are not eligible for a bonus ");
        }
    }
}





















