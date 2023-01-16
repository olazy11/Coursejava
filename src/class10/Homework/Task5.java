package class10.Homework;


/* Create an array of size 5 on integers and calculate the sum of all elements in an array.
* */
public class Task5 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + numbers[i];
        }

            System.out.println(sum);

        }



            }






