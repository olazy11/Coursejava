package class30.Homework;

import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> num = new LinkedList<>();
        num.add(10);
        num.add (15);
        num.add (25);
        num.add (35);
        int sum = 0;
        for (Integer x: num) {
                     sum =sum +x;

        } System.out.println(sum);
    }
}
