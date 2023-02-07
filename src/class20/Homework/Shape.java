package class20.Homework;
/*Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
In circle class create a method to calculate the area of circle. Test your code
 * */
public class Shape {
    double radius;

    Shape (double radius) {
        this.radius=radius;    }   }

class Circle extends Shape {
    double area;
    double pi;
    Circle(double radius,double pi){
        super(radius);
    this.pi=pi;}

    double CalculateArea (){
        area =(super.radius*super.radius)*pi;
        return area;


        }

}

