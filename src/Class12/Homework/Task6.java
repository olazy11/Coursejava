package Class12.Homework;
/*Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

 * */
public class Task6 {
    public static void main(String[] args) {


        int[][] numbers = {{1, 3, 5}, {6, 3, 7}, {9, 8, 1}};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }

                    System.out.println(sum);

                }

            }







