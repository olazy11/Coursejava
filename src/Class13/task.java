package Class13;

import java.util.Scanner;

/*Store username, password and confirm password from a user and check following requirements:

Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
* */
public class task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username ");
        String username = input.nextLine();

        System.out.println("Please enter your password");
        String password = input.nextLine();

        System.out.println("Please confirm your password");
        String password2 = input.nextLine();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");

        } else if (password.length() < 8) {
            System.out.println("Password is too short");

        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");

        } else if (!password.equals(password2)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username ad password has been created");

        }
    }
}





