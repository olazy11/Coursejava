package class16.Homework;
/*4)Create a method that will say Hello in different language based on the country that will be passed when method is executed
* */
public class Task4 {

   String sayHello (String countryName) {

    switch (countryName) {
    case "USA":
        return "Hello";
    case "Kazakhstan":
        return "Salem";
    case "Italy":
        return "Ciao";
    default:
        return "Country not supported";

           }
   }

    public static void main(String[] args) {
Task4 task4 =new Task4 ();
        System.out.println(task4.sayHello("USA"));
    }
}
