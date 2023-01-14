package Class9;

public class BreakDemo {
    public static void main(String[] args) {
    boolean summer =true;
    int temp =75;

    while (summer) {
        if (temp<=100) {
            System.out.println("I love summer" +temp);
        }else{
            System.out.println("Its very hot");
            break;
        }
        temp+=5;
    }



    }
}
