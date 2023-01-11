package homeworkClass4;
/*
Write a program to check whether number is positive or negative.
Interview Question
Write a Java Program to check whether number is Even or Odd.
 */
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("the number is positive");
        } else {
            System.out.println("the number is negative");
        }

        if (number%2==0) {
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }

    }
}
