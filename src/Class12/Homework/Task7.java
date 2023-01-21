package Class12.Homework;
/*Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
Develop a program which will identify/print the even numbers only.
* */
public class Task7 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 3, 5, 5}, {6, 3, 7, 8}, {9, 8, 1, 7}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0) {
                    System.out.print(numbers [i][j] + " ");
                }

            }

        }
    }
}





