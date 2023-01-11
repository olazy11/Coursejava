package homeworkClass5;

import java.util.Scanner;

/*
Create a Java program that will ask if user has a credit card or not.
If you user does not have a credit card then offer them.
If they do have one ask what is balance on the card? If balance of the card is larger than 1000,
tell them to pay off immediately, otherwise you can tell them that they can spend more.
 */
public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a card?");
        boolean yourcard=input.nextBoolean();

        if (yourcard==false) {
            System.out.println("You are offered a card");
        }else if (yourcard==true){
            System.out.println("What is balance on the card?");

            int balance = input.nextInt();
            if (balance >1000) {
                System.out.println("Pay off immediately");
            }else{
                System.out.println("You can spend more");
            }
        }

    }
}
