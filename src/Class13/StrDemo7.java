package Class13;

public class StrDemo7 {
    public static void main(String[] args) {
        String str = "akdfhaAPGf 34568 @#@#";
        int counter = 0;
        for (int i = 0; i < str.length() ; i++) {
            /*if (Character.isAlphabetic(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total characters"+counter);
*/
            if (Character.isDigit(str.charAt(i))) {
                counter++;
            }
        }
        System.out.println("Total characters" + counter);
    }
}


