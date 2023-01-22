package Class13;

public class StDemo3 {
    public static void main(String[] args) {


        String str = " "; //true or false to check if there is an input
        boolean isEmpty =str.isEmpty(); //alernative way
        System.out.println(str.isEmpty()); //sees spaces as letters
        System.out.println(str.isBlank());//different a bit, it does not see spaces, more precise
    }
}
