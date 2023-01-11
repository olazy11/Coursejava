package Class6;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("Please enter three numbers");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a > b && a > c) {
            System.out.println("the largest number is " + a);
        }
        if (b > a && b > c) {
            System.out.println("the largest number is " + b);
        } else {
            System.out.println("the largest number is " + c);
        }

    }
}




