
package Class6.Homework;

import java.util.Scanner;
public class Task6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b) {
            if (a > c)
                System.out.println("the largest number is " + a);
        }
        if (b > a) {
            if (b > c)
                System.out.println("the largest number is " + b);

        }
        if (c > a) {
            {
                if (c > b)
                    System.out.println("the largest number is " + c);
            }
        }
    }
}
















