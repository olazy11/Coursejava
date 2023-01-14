package Class9;

public class NestedLoopsDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {            ///1 2 3 4 5 executes below code 3 times

            for (int j = 1; j <=5 ; j++) {
                System.out.print(j+" ");//prints the value of j from  1 to 5
            }

            System.out.println();
        }
    }
}

