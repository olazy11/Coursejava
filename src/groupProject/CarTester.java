package groupProject;

public class CarTester {
    public static void main(String[] args) {
        Car [] cars = {new Sedan(2500.0,"white", 18), new Truck(15600.0,"blue",2500.9)};
        for (Car x: cars) {
            System.out.println(x.calculateSalePrice());
        }
    }
}
