package class20;

public class SuperClass {
    SuperClass() {
        System.out.println("I am a constructor from the parent class");
    }
}
    class Subclass extends SuperClass {
Subclass () {
   /* super();*/ //makes a call to the parent class constructor/has to be a 1st line
    System.out.println("I am a child constructor");
}
    }

