package projectBasic1;
/*
1)Using Scanner create an array of integer values.
        After the array is created, calculate the sum of all stored elements in that array.
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] numbers = new int [5];
        numbers [0] = input.nextInt();
        numbers [1] = input.nextInt();
        numbers [2] = input.nextInt();
        numbers [3] = input.nextInt();
        numbers [4] = input.nextInt();

        int sum =0;
        for (int x: numbers){
            sum =sum +x;}
                System.out.println(sum);


            }

        }



