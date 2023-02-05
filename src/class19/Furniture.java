package class19;

public class Furniture {
    String type;
    double price;
    String color;

  Furniture (String type, double price, String color) {
      this.type = type;
      this.price = price;
      this.color = color;

  }
    void print () {
        System.out.println( type+price+color);
    }
}
