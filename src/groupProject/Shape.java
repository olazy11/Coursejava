package groupProject;

public interface Shape {
    public static void main(String[] args) {
        Shape[] sp = {new Circle(5.0), new Square(2.1)};
        for (Shape x : sp) {
            System.out.println( x.calculateArea());
            System.out.println(x.calculatePerimeter());        }    }
    double calculateArea();
    double calculatePerimeter();}

 class Circle implements Shape{
double radius;
public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double calculateArea() {
         return (this.radius*this.radius)*3.14;
        }
        @Override
        public double calculatePerimeter() {
            return 0;        }    }

class Square implements Shape{
double side;
        public Square(double side) {
            this.side = side;        }
        @Override
        public double calculateArea() {
            return 0;        }

        @Override
        public double calculatePerimeter() {
            return 4*side;        }    }

