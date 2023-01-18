package class11;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] numbers = new int [5];
        //below is manual input
        /*numbers[0] = 50;
        numbers[1] = 30;
        numbers[2] = 55;
        numbers[3] = 60;
        numbers[4] = 52;*/
//below code takes the numbers from user and stores in array
      /*  numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        numbers[3] = scanner.nextInt();
        numbers[4] = scanner.nextInt();
*/
        for (int i = 0; i < numbers.length ; i++) { //shorter way to store numbers
            numbers[i] =scanner.nextInt();

        }

        System.out.println(Arrays.toString(numbers));
    }
}
