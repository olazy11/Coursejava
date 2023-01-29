package class17.Homework;
/*1) Create a method that will accept an array as parameters and will return a sum of all elements from that array.
Method should be visibly only within same package and accessible by the creating an instance(object) of the class.
 * */
public class Task1 {
    int sumArrayElements(int[] array){

        int sum=0;
        for (int num:array) {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr={10,25,35,45};
        Task1 task7=new Task1();

        System.out.println(task7.sumArrayElements(arr));

    }
}






