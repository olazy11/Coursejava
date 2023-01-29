package class16.Homework;
/*5) Write a method to return whether given number is prime or not?
* */
public class Task5 {

    boolean isPrime(int num) {

        boolean flag = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    // return flag;
                    break;
                }

            }
        } else {
            flag = false;

        }
        return flag;

    }
    public static void main(String[] args) {
        Task5 task5=new Task5();
        System.out.println(task5.isPrime(3));

    }}
