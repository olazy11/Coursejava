package class14.Homework;
/*5) How would you check if String is palindrome or not? aba=> true
Abbc =>false
* */
public class Task6 {
    public static void main(String[] args) {
        String str = "Abba";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }if (reverse.equalsIgnoreCase(str)) {
                System.out.print("The string is palindrome ");
            } else {
                System.out.println("The string is not palindrome");

            }
        }
    }





