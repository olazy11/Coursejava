package class28;

import java.util.ArrayList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        long startTime =System.currentTimeMillis();
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add (0, "da");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
