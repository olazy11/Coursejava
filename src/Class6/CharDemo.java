package Class6;

import java.util.Scanner;

public class CharDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your gender m f");
        char gender = input.next().charAt(0);

        switch (gender) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("wrong");

        }
    }
}
