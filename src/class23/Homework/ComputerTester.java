package class23.Homework;

import java.util.concurrent.Callable;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] compy = {new Apple(), new Dell(), new HP(), new Lenovo()};
        for (Computer x : compy) {
            x.process();
            x.robust();



        }
    }
}