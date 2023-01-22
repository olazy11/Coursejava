package ProjectBasic1;
/*3) Create a 2D array of integer values. Print the sum of all numbers.*/

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {2, 5, 4}, {8, 7, 9}};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println(sum);

        for (int[] arr : numbers) {
            for (int i : arr) {
            }
        }
            System.out.println(sum);


        }
    }


















