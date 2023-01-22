package Class13;

public class StrDemo8 {
    public static void main(String[] args) {
        String str = "Java is not pain";
        System.out.println(str.indexOf("J"));//indexes of the letters
        System.out.println(str.indexOf("not"));//coutns from where it starts
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+" has inex  "+ i);

        }
    }
}

