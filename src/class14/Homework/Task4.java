package class14.Homework;
/*4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

* */
public class Task4 {
    public static void main(String[] args) {
        String str ="This is sentence i want to reverse";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));

        }

    }
}
