package ProjectBasic1;
/*9)Maximum and minimum number in the array?*/

public class Task9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 7, 9};
        int max = 0;
        int min = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];}
                if (min > numbers[i]) {
                    min = numbers[i];}                }

                System.out.println("The maximum value of the array is " + max + " and minimum is " + min);


            }

        }







