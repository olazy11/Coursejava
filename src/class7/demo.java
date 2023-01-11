package class7;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("Please enter day of week");
        Scanner input = new Scanner(System.in);
        String day = input.next();

        if (day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
            System.out.println("weekend");
        } else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")) {
            System.out.println("manual testing");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("review class");

        } else {
            System.out.println("You've entered wrong word");

        }
    }
}






