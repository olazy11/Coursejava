package class20;

public class Child1 extends Parent {

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.hello();
       /* c1.bye(); //static should be access by the class name/parent*/
       /* c1.money() /private */
        Parent.bye();
        Child1.bye(); //or through name of the child class
        c1.name = "Gulya";
        /*Parent.lastName = " Obi";*/ //can be
        Child1.lastName ="Obi";
    }
}
