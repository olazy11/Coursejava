package class16;

import java.util.Scanner;

public class MethodsDemo {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter a number");
            int num = scanner.nextInt();

            System.out.println("You entered " + num);

            Methods methods = new Methods();
            // String num2= methods.doSomeThing();
            String c = methods.method2();
        }
        }

