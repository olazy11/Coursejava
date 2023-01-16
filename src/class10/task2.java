package class10;
/*create an array and store 10,20,30,4,5,6,7,80*/
// add all the element which are multiple of 2

public class task2 {
    public static void main(String[] args) {//here checking values
        int[] arr = {10, 20, 30, 4, 5, 6, 7, 80};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];

            }
        }
        System.out.println(sum);
    }
}


        /*int[] numbers = new int[8];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 80;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum = sum + numbers[i];
            }
            System.out.println(sum);

*/
