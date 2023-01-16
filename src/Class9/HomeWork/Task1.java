package Class9.HomeWork;
/*Print numbers from 1 to 50 except those that are divisible by 3
* */
public class Task1 {
    public static void main(String[] args) {

        for (int i = 1; i < 51; i++) {
            if (i % 3 == 0){
            continue;}

            System.out.println(i);
        }
    }
}
 /*for (int i = 1; i < 51; i++) {
        if (i % 3 != 0){
        System.out.println(i);
        }
        }
        }*/