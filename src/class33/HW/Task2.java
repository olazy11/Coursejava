package class33.HW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*2) Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
Call your method inside main and print name and details of all Exception objects.

* */
public class Task2 {
    public static void main(String[] args) {
        DisplayListOfEx();
    }

    public static List<Exception> DisplayListOfEx() {
        List<Exception> listOfExceptions = new LinkedList<>();
        try {
            String s = "abc";
            int i = Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            System.out.println("Exception name is " + nfe+" You cannot covert String into integer");
            listOfExceptions.add(nfe);
        }

        try {
            int a =50, b=0;
            int data =a/b;
        } catch (ArithmeticException ae) {
            {
                System.out.println("Exception name is " + ae+ " You cannot divide by O");
                listOfExceptions.add(ae);
            }

            try {
                String s = null;
                System.out.println(s.length());
            } catch (NullPointerException np) {
                System.out.println("Exception name is " + np +" Please enter value in your variable, it cannot be null");
                listOfExceptions.add(np);
            }

            try {
                int a[] = new int[5];
                a[10] = 50;
            } catch (ArrayIndexOutOfBoundsException ai) {
                System.out.println("Exception name is " + ai+ " Enter correct index of array");
                listOfExceptions.add(ai);
            }
        }

        return listOfExceptions;
    }
}




