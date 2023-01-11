package Class6.Homework;

import java.util.Scanner;

/*1) Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
* */
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int height = input.nextInt();
        if (height < 60) {
            System.out.println("You are short");}
            if (height > 60 && height <= 72) {
                System.out.println("You are medium");}
                if (height > 72) {
                    System.out.println("You are tall");
                }
            }
        }






