package Class13;

public class StrDemo4 {
    public static void main(String[] args) {
        String str = "Java";
        String str2 ="Java";

        boolean areEqual =str.equals(str2);//true
        System.out.println(areEqual);

       /* String str = "Java";
        String str2 ="JAVA"; //false since case sensitive

        boolean areEqual1 =str.equals(str2);
        System.out.println(areEqual1);*/

        boolean areEqual2 =str.equalsIgnoreCase(str2);
        System.out.println(areEqual2);

    }
}
