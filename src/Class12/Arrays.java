package Class12;

public class Arrays {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };

        System.out.println(matrix[2][4]); //одно число 25

       /* System.out.println(Arrays.toString(matrix[0])); //gives us a complete row
*/

        for (int i = 0; i < matrix[0].length; i++) { //entire array
            System.out.println(matrix[0][i]);
        }

        int[] arr = matrix[0]; // getting complete first row from 2D array -10,20,30
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

