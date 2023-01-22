package Class12.Homework;
/*) Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.*/
public class Phone {
    String name;
    String color;
    int yearbuilt;
    String sound;
    String chargingSpeed;

    void ring() {
        System.out.println(name + " is ringing " + sound);
    }

    void charging() {
        System.out.println(name + " is charging " + chargingSpeed);
    }

}









