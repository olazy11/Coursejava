package Class6.Homework;

import java.util.Scanner;

/*
* 4)Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born __”. (edited)

*/
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month = input.nextLine();
        String season1 = "Summer";
        String season2 = "Autumn";
        String season3 = "Winter";
        String season4 = "Spring";

        if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
            System.out.println("You were born in " + season1);
        }else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
            System.out.println("You were born in" + season2);
        }else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
            System.out.println("You were born in" + season3);
        }else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
                        System.out.println("You were born in" + season4);
                    }


                }
            }



