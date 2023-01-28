package class16;

public class MPractice2 {

    int biggerNumber (int number1, int number2) {
        if (number1>number2) {
           return number1;

        }else{
           return number2;
        }

    }

    public static void main(String[] args) {
       MPractice2 mp = new MPractice2();
        System.out.println(mp.biggerNumber(12,13));
    }
}
