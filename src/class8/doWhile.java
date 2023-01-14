package class8;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        do {
            System.out.println("please enter your number");
            number = input.nextInt();
              }
        while (number!=5);
    }

}
