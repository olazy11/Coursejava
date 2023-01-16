package Class9.HomeWork;

import java.util.Scanner;
/*
 Write a program that reads a range of integers
(start and end point), provided by a user and then from that range prints the sum of the even and odd integers.
* */

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a range of integers");
        int start = input.nextInt();
        int end = input.nextInt();
        int evenSum =0;
        int oddSum =0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;

            } else {
                oddSum += i;
            }
        }
            System.out.println("sum of even numbers:" +evenSum);
            System.out.println("sum of odd numbers:" + oddSum);


        }
    }

