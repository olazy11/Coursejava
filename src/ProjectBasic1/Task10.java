package ProjectBasic1;
/*10)Write a java program to find the second largest number in the array?*/

public class Task10 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 7, 9};
        int max = 0;
        int secondmax = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                secondmax = max;
                max = numbers[i];

            } else if (numbers[i] > secondmax && numbers[i] != max)
                secondmax = numbers[i];
        }

          System.out.println("The second largest value of the array is "+secondmax);

}
        }






