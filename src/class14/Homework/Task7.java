package class14.Homework;
/*6) How would you swap  2 strings without a temporary variable?
* */
public class Task7 {
    public static void main(String[] args) {
String str1 ="My cat's name";
String str2 ="Kuzya";
        System.out.println(str1 + " "+ str2 );
        str1=str1+str2;

        str2= str1.substring(0, str1.length()-str2.length());
        str1= str1.substring(str2.length());
        System.out.println("After swapping 1 to str2 : " + str1 +" " +str2);


        
    }
}




