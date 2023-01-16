package Class9.HomeWork;
/*Print the following pattern:
55555
4444
333
22
1
* */
public class Task5 {
    public static void main(String[] args) {//here checking indexes

        for (int i = 0; i < 6; i++) {
            for (int j=5; j>0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}


