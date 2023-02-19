package groupProject;

public interface Shape {

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

