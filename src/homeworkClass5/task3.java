package homeworkClass5;

import java.util.Scanner;

/*
You are a loan specialist and you need to ask user what is the amount of loan is needed.
If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
 */
public class task3 {
    public static void main(String[] args) {
        int loan = 100000;

        Scanner amount = new Scanner(System.in);
        System.out.println("How much do you need as a loan?");
        int loanamount = amount.nextInt();

        if (loanamount<=200000) {
            System.out.println("you got a loan");
        }else{
            System.out.println("your loan is rejected");
        }
    }
}
