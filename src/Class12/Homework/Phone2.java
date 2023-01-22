package Class12.Homework;

public class Phone2 {
    public static void main(String[] args) {

        Phone ph1 = new Phone();
        ph1.name = "IPhone";
        ph1.color = "red";
        ph1.yearbuilt = 2017;
        ph1.sound = "very loud";
        ph1.chargingSpeed = "fast";
        ph1.ring();
        ph1.charging();


        Phone ph2 = new Phone();
        ph2.name = "Pixel";
        ph2.color = "Black";
        ph2.yearbuilt = 2022;
        ph2.chargingSpeed = "average";
        ph2.sound = "loud";
        ph2.ring();
        ph2.charging();


        Phone ph3 = new Phone();
        ph3.name = "Samsung";
        ph3.color = "white";
        ph3.yearbuilt = 2010;
        ph3.sound = "not good";
        ph3.chargingSpeed = "low";
        ph3.ring();
        ph3.charging();

    }
}
