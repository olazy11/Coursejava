package Class13;

public class StrDemo9 {
    public static void main(String[] args) {
        String str = "Send to the support channel.More Java";
        String newStr = str.substring(5);//to the support channel (specify starting point)
        System.out.println(newStr);
        System.out.println(str.substring(0,27));//Send to the support channel (specify start and end point)

        }
    }


