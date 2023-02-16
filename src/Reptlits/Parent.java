package Reptlits;

public class Parent {
    public void print1() {
        System.out.println("I am a parent public method");    }
    protected void print2() {
        System.out.println("I am a parent protected method");    }
    void print3() {
        System.out.println("I am a parent default method");   }
    private void print4() {
        System.out.println("I am a parent private method");    }}

class Child extends Parent {

    @Override
    public void print1() {
        System.out.println("I am a child public method");  ;
    }

    @Override
    protected void print2() {
        System.out.println("I am a child protected method");
    }

    @Override
    void print3() {
        System.out.println("I am a child default method");;
    }

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.print1();
        c1.print2();
        c1.print3();
    }



}



