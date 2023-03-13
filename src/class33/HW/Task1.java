package class33.HW;

import java.util.InputMismatchException;
import java.util.Scanner;

/*) How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected.
* */
public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        try {
            int integer = scanner.nextInt();}

        catch (InputMismatchException err) {
            System.out.println("Type a number, not a text");
        }

    }
}

