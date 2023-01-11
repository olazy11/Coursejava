package Class6;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("please enter your age");
         Scanner scanner = new Scanner (System.in);

        /* int age = scanner.nextInt();

        System.out.println("you are "+age+ " years old");
*/
        System.out.println("please enter your gender");
        char gender = scanner.next().charAt(0);
        System.out.println("your gender is "+ gender);
        scanner.close();
    }
}
