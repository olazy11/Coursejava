package projectBasic1;
/*
4) Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
*/

public class Task4 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {2, 5, 4}, {8, 7, 9}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers [i][j]%2==0) {
                    System.out.println( numbers[i][j]);
                }
            }
        }
    }
}







