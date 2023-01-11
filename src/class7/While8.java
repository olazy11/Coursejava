package class7;

public class While8 {
    public static void main(String[] args) {

        boolean condition = true;
        int number = 0;
        while (condition) {
            System.out.println("hello");
            if (number > 3) {
                condition = false;
            }
            number++;
        }
    }
}