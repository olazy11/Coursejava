package class11;

import org.w3c.dom.ls.LSOutput;

public class D2ArraysDemo1 {
    public static void main(String[] args) {


    int [] [] matrix = {{10,20,30},
                      {44,32,56,12},
                      {12,3,45},
    };
//System.out.println( matrix[1][1] );
        for (int i = 0; i < matrix.length ; i++) {
            for (int j= 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        }





}







