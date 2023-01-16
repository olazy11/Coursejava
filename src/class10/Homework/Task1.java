package class10.Homework;

public class Task1 {
    /*Create an array of chars and store grades into it: A,B,C,D,E,F.
 Then print a grade B (use 2 different ways of creating an array).
* */

    /* public static void main(String[] args) {
         char[] letters = {'A', 'B', 'C', 'D', 'E', 'F'};
         {
             System.out.println(letters[1]);

         }
     }
 }*/
    public static void main(String[] args) {
        char[] x = new char[6];
        x[0] = 'A';
        x[1] = 'B';
        x[2] = 'C';
        x[3] = 'D';
        x[4] = 'E';
        x[5] = 'F';
        System.out.println(x);
    }
}




