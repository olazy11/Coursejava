package class33.HW;

import java.util.Scanner;

/*
4) Create a method checkUserName that will throw a runtime exception. Method should throw an exception when entered username is less than 5 characters.
* */
public class Task4 {
    public static void main(String[] args) {

try {
    checkUserName();
}
catch (RuntimeException rt){
    System.out.println(rt);
}
    }

    public static String checkUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();

        if (name.length() < 5) {
            throw new RuntimeException("Your name shall be more than 5 characters");
        } else {
            System.out.println("You entered correct name");
        }
        return name;
    }
}

