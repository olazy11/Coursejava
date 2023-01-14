package Class9;

public class NestedDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                if (j==1||j==2) {
                    continue;
                }

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

