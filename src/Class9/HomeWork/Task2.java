package Class9.HomeWork;

import java.util.Scanner;

/*Create a program that will be asking user to apply for a credit card 10 times. As soon you get an “yes” from a user program should stop asking.
* */
public class Task2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.println("Do you wish to apply for a credit card?");
            String a = input.next();

            if (a.equalsIgnoreCase("Yes")) {
                break;
            }
        }
    }
}










