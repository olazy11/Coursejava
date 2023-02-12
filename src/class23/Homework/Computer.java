package class23.Homework;
/*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.*/
public class Computer {
    public void process () {
        System.out.println("Processing    ");
    }
    public void robust () {
        System.out.println("Able to cope with errors during execution and cope with erroneous input ");
    }
}

class Apple extends Computer {
    @Override
    public void process() {
        System.out.println("Processing    ");
    }

    @Override
    public void robust() {
        super.robust();
    }
}

class Lenovo extends Computer {
    @Override
    public void process() {
        super.process();
    }

    @Override
    public void robust() {
        System.out.println("Able to cope with errors during execution and cope with erroneous input for 60% ");
    }
}

class HP extends Computer {
    @Override
    public void process() {
        System.out.println("Processing  fast");
    }

    @Override
    public void robust() {
        super.robust();
    }
}
class Dell extends Computer {
    @Override
    public void process() {
        super.process();
    }

    @Override
    public void robust() {
        System.out.println("Able to cope with errors during execution and cope with erroneous input for 80% ");
    }
}