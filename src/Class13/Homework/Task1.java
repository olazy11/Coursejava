package Class13.Homework;
/*) Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
For Example String str=hello =>l

* */
public class Task1 {
    public static void main(String[] args) {
        String str = "#$@!* hi guys";

        boolean isEmpty = str.isEmpty();
        int len=str.length();
        int middle = len / 2;
        char character = str.charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;

            if (isEmpty) {
            } else if (count % 2 != 0 && count >= 3) {
            }
        }
                System.out.println(str.charAt(middle));

                }
            }









