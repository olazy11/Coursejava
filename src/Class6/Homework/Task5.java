package Class6.Homework;

import java.util.Scanner;

/*
Write a program to find largest of three double values using
if-else..if and logical operators provided by a user (numbers must be distinct)
 */
public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("Please enter three numbers");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a > b && a > c) {
            System.out.println("the largest number is " + a);
        }else if (b > a && b > c) {
            System.out.println("the largest number is " + b);
        }else if (c > a && c > b) {
                    System.out.println("the largest number is " + c);
                }

            }

        }



