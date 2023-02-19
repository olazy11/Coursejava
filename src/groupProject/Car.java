package groupProject;
/*

The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount
* */
public class Car {
   double carPrice;
   String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice(){
   return 0;}
}
class Sedan extends Car {
    int length;
    public Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }
    @Override
    double calculateSalePrice() {
        if (length >20){
            carPrice = carPrice - (carPrice * (carPrice *5 / 100)) / 100;
            return carPrice;
        } else {
            carPrice = carPrice - (carPrice * (carPrice *10 / 100)) / 100;
            return carPrice;
        }
        }
        }
class Truck extends Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            carPrice = carPrice - (carPrice * (carPrice * 10 / 100)) / 100;
            return carPrice;
        } else {
            carPrice = carPrice - (carPrice * (carPrice * 20 / 100)) / 100;
            return carPrice;

        }
    }
}

