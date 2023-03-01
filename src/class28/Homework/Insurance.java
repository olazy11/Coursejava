package class28.Homework;
/*6) Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
Car class has it’s own attribute as carModel and Class Pet has petType attribute.

Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.

 * */
public abstract class Insurance {
   private  String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();

    public abstract void cancelInsurance();

}
class Car extends Insurance {
    String carModel;



     Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
                System.out.println("your "+ carModel+" car quote is 250$");
    }

    @Override
    public void cancelInsurance() {

        System.out.println("Your car insurance is valid");
    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    public void getQuote() {
        System.out.println("your pet quote for " +petType+" is 350$");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Your pet insurance is due 25.10.2023");
    }
}
class Health extends Insurance {
    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("your health quote is 550$");;
    }

    @Override
   public void cancelInsurance() {
        System.out.println("Your health insurance is to be extended");
    }
}

