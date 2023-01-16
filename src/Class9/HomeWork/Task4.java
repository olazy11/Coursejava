package Class9.HomeWork;

import java.util.Scanner;

/*import java.util.Scanner;

*//* 1.Write a program
to ask a user to enter item they want to buy and the price of that item.

2. Every time user enters money accumulate the amount

3. and tell the user how much is total which is left to pay off.

4. If user give more money program should return a change.

 5. Whenever a user done with payments program should say "Thank you for shopping!"
* */
public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("please enter item name");
            String item = input.next();
            System.out.println("please enter price");
            double price = input.nextDouble();
            total = total + price;
            System.out.println("total is total" + total);
        }

        System.out.println("please pay for the items");
        double amountPaid = input.nextDouble();

        if (amountPaid > total) {
            double change = amountPaid - total;
            System.out.println("your change is" + change);
        } else if (amountPaid < total) {
            System.out.println("You cant pay");
        }
        System.out.println("thanks for shopping");
    }
}




