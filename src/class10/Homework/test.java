package class10.Homework;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            System.out.println("Please enter day 1 of the week");
        System.out.println("Please enter day 2 of the week");
        System.out.println("Please enter day 3 of the week");
        System.out.println("Please enter day 4 of the week");
        System.out.println("Please enter day 5 of the week");
        System.out.println("Please enter day 6 of the week");

            String days = input.next();

            String[] words = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            for (int i = 0; i <= 5; i++) {

                System.out.println(words[i]);
            }

        }
    }



