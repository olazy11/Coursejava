package class29;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        HashSet <String> fruit = new HashSet<>();
        fruit.add ("Mango");
        fruit.add ("Kiwi");
        fruit.add ("Orange");
        /*fruit.add ("Mango");*///do not allow duplicate, does not maintain insertion order/very fast
        System.out.println(fruit);
    }
}
