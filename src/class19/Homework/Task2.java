package class19.Homework;
/*Write program to inherit class A that has method printF which is static and call or reuse that method into class B
*
* */
public class Task2 {
    static void printF () {
        System.out.println("Class A printF method");
    }
    class B extends Task2 {

        public void print () {
            System.out.println("Class B print method" );
        }


    }
}
