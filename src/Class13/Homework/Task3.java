package Class13.Homework;

import java.util.Scanner;

/*3) Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
* */
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your mother's first name?");
        String nameM = input.next();
        System.out.println("what is your father's first name?");
        String nameF = input.next();
        System.out.println("Is it a boy or a girl?");
        String childGender = input.next();

        if (childGender.equalsIgnoreCase("girl")) {
            System.out.println(nameM.substring(0,nameM.length()/2).concat(nameF.substring(nameF.length()/2)).toUpperCase());

            }else if (childGender.equalsIgnoreCase("boy")) {
            System.out.println(nameF.substring(0,nameF.length()/2).concat(nameM.substring(nameM.length()/2)).toUpperCase());
        }
    }
}



