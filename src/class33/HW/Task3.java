package class33.HW;

import java.util.Scanner;

/*
3) Create a method to check age eligibility that will throw a runtime exception. Method should throw an exception age is less than 16.
* */
public class Task3 {
    public static void main(String[] args) {
        try {
            checkAgeEligibility();
        } catch (RuntimeException rt) {
            System.out.println(rt);
        }
    }
    public static void checkAgeEligibility(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if (age<16) {
            throw new RuntimeException("You are not eligible");
        } else {
                System.out.println("You are eligible");

            }
        }
    }

