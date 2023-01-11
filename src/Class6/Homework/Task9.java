package Class6.Homework;

import java.util.Scanner;

/*HomeWork: Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
Based on operator provide the result to user. (edited)
* */
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Please enter your operator:+,-,*,/ ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
        }

    }
}
