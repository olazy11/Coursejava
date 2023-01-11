package homeworkClass4;
/*Create a Java program and name it Double Comparison.
 Declare 2 double values and if value of first variable is higher then the second,
 print “Double value  is larger than  .” Otherwise print...

 */

import java.util.Scanner;

public class DoubleComparison {
    public static void main(String[] args) {

        System.out.println("Please enter 1st value");
        Scanner input = new Scanner (System.in);
        double val1 = input.nextDouble();
        System.out.println("Please enter 2nd value");
        double val2 = input.nextDouble();

        if (val1>val1){
        System.out.println("Double value"+val1+"is later than"+val2);
    }else{
        System.out.println("...");


}
    }
}
