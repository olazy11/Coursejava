package class14.Homework;
/*You have a String a=”Is it saturday?
Is it raining? Do we have a Java Class today?”
How would you find out how many sentences are in that String?
* */
public class Task3 {
    public static void main(String[] args) {
        String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] strArr = str.split("[?]");
        System.out.println(strArr.length);

        }

}
