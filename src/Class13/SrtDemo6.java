package Class13;

public class SrtDemo6 {
    public static void main(String[] args) {
        String str = "Java is Love";
        char character = str.charAt(2); //second letter
        System.out.println(character);


        /*for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
*/
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)=='a'){
                    count++;
                }
            }
                System.out.print(count);
        }

    }



