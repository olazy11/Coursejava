package class22.Homework;
/*Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
* */
class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        System.out.println("Interest amount of is " + (balance * interest) / 100);
 }
    public static void main(String[] args) {

        CreditCard cc = new CreditCard(4.1, 1039);
        cc.calculateInterest();

        Visa vs = new Visa(4.3, 1040);
        vs.calculateInterest();

        AX vx = new AX (3.2, 300);
        vx.calculateInterest();
    }
}
class Visa extends CreditCard {
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}
    class AX extends CreditCard {
        public AX(double balance, double interest) {
            super(balance, interest);
        }
        @Override
        public void calculateInterest() {

            System.out.println("Interest amount of AX card is " + ((balance * interest) / 100 )+ 40);
        }
    }



