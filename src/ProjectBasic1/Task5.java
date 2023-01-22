package ProjectBasic1;
/*
5)Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.
*/

public class Task5 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {2, 5, 4}, {8, 7, 9}};
        int sum = 0;
        int sum1 =0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sum = sum + numbers[i][j];

                }
                if (numbers[i][j] % 2 != 0) {
                    sum1 = sum1 + numbers[i][j];
                }
            }
        }

                System.out.println ("The sum of even numbers is " + sum+ " and the sum of odd is " + sum1 ) ;
            }
        }













