package Class12;
// write a loop to print all the elements from this 2D array
//matrix.length tells us how many 1D arrays are present in this 2D array
public class ArraysTest {
    public static void main(String[] args) {
        int [][] matrix={{10,20,30},
                         {45,55,66},
                         {30,40,20,10,25}
        };


        for (int i = 0; i < matrix.length; i++) {

        //matrix[i].length the size of each 1D array
        for (int j = 0; j <matrix[i].length ; j++) {
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }

        }
    }

