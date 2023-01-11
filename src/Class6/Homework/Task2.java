package Class6.Homework;

/*

*  Write a program that will print whether it is a weekend or weekday.
* If any day from 1-5 → output “It is a weekday”,
* anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day” (edited)
*/


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter the number of the weekday");
        int day = input.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("it is a weekday");
        } else if (day >= 6 && day <= 7) {
            System.out.println("it is a weekend");
        } else {
            System.out.println("Invalid day");
        }
    }
}









