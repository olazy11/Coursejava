package class18.Homework;
/*) Write a java class that have 4 constructors with 4 different access levels of constructors
(private,public,default,protected) and create 4 objects of this class:
1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
* */
public class Bike {
    String make;
    int year;
    String color;
    String engine;

    public Bike(String car1Make, int car1Year, String car1Color) {
        this.make = car1Make;
        this.year = car1Year;
        this.color = car1Color;
    }

    private Bike(String car2Make, int car2Year) {
        this.make = car2Make;
        this.year = car2Year;

    }
    protected Bike(String car3Make) {
        this.make = car3Make;
          }
    Bike(String car4Make, int car4Year, String car4Color, String car4Engine) {
        this.make = car4Make;
        this.year = car4Year;
        this.color = car4Color;
        this.engine = car4Engine;
    }
    public void printInfo() {
        System.out.println("Car " + make + "is built in " + year + " is painted in " + color);
    }

    public static void main(String[] args) {
        Bike c = new Bike("Audi", 1975, "white", "102HP");
        c.printInfo();
    }

}

