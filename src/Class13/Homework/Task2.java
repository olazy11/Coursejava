package Class13.Homework;
/*2) Create a String and print it in reverse order (Sunday → yadnuS).
* */
public class Task2 {
    public static void main(String[] args) {
        String st1 = "Happy future";
        String reversedSt1 = "";

            for(int i = st1.length()-1; i >= 0; i--){
                reversedSt1 = reversedSt1 + st1.charAt(i);
                       }
            System.out.print(reversedSt1);
        }
    }




