package class3;

public class IfElse4 {
    public static void main(String[] args) {
        String name = "Sam";
        //with non primitive data tapes such as String we cannot use == symbol, we use  matters
        if (name.equals("Sam")) {
            System.out.println("Amazing student");
        }

        if (!name.equals("Sam"))//! = not equals to
        {
            System.out.println("Super amazing student");
        }
    }}
