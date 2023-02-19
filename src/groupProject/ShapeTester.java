package groupProject;

public class ShapeTester {
    public static void main(String[] args) {
        Shape[] sp = {new Circle(5.0), new Square(2.1)};
        for (Shape x : sp) {
            System.out.println( x.calculateArea());
            System.out.println(x.calculatePerimeter());        }    }
}
