package homeworkClass5;
/*
Create a Java program and store values of mortgage rate and mortgage price.
 First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying.
  Once user decides to buy a house,
 if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
 */
public class task2 {
    public static void main(String[] args) {
        double rate = 3.5;
        int price = 100000;

        if (rate > 4.5) {
            System.out.println("You should not buy a house");
        } else {
            System.out.println("Consider buying a house");
            if (price > 200000) {
                System.out.println("Take a loan");
            } else {
                System.out.println("Pay cash");
            }

        }
    }
}
