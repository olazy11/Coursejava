package Class13;

public class StrDemo6 {
    public static void main(String[] args) {
        String str ="I love java";
        boolean starsWith =str.startsWith("I love");//checks if it starts with
        System.out.println(starsWith);

        System.out.println(str.endsWith("java")); //checks if it ends with

        System.out.println(str.toLowerCase().startsWith("i")); //method chaining/first we convert to lower case and then check

        System.out.println(str.contains ("java"));

    }
}
