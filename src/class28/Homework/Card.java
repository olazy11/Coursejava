package class28.Homework;
/* Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.
* */

import java.util.Iterator;
import java.util.LinkedList;

public class Card {
     public static void main(String[] args) {
        Card card1 = new Card(5, "Visa");
        Card card2 = new Card(4, "MasterCard");
        Card card3 = new Card(3, "American Express");

        LinkedList<Card> cards = new LinkedList <> ();
         cards.add (card1);
         cards.add (card2);
         cards.add (card3);

         for (int i = 0; i < cards.size(); i++) {
             cards.get(i).display();
             System.out.println("**********");

         }
         for (Card x : cards) {
             x.display();
             System.out.println("**********");

         }
         Iterator<Card> iterator = cards.iterator();
         while (iterator.hasNext()) {
             Card i = iterator.next();
             i.display();
             System.out.println("**********");

         }
     }



        double interestRate;
        String cardType;

        public Card(double interestRate, String cardType) {
            this.interestRate = interestRate;
            this.cardType = cardType;
        }
        public void display () {
            System.out.println(cardType+ " has an interest rate of "+interestRate);
        }
}