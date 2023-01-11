package Class6.Homework;

import java.util.Scanner;

/*
Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade -->
* Not Acceptable. At the end your program should print which grade was entered by a user with explanation.
*
 */
public class Task8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your grade");
        char grade = input.next().charAt(0);


        switch (grade) {
            case 'A':  System.out.println("Excellent");
                break;
            case 'B':  System.out.println("Good");
                break;
            case 'C':  System.out.println("Average");
                break;
            case 'D':  System.out.println("Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }
        System.out.println("You've entered "+ grade);
    }
}

