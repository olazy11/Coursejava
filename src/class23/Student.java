package class23;
/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
* */
public class Student {

     public void study () {
        System.out.println("I study hard");
    }
}

class SyntaxStudent extends Student{
    @Override
    public void study() {
        System.out.println("I study super hard");
    }
   public void rest () {
        System.out.println("I hardly rest");
    }
}

class  CollegeStudent extends Student {
    @Override
   public void study() {
        System.out.println("I study not really hard");
    }

void out () {
    System.out.println("I go out at weekends");}
}

class SchoolStudent extends Student {
    @Override
   public void study() {
        System.out.println("I study not hard at all");
    }
    public void cinema () {
        System.out.println("I go to cinema with my friends often");
    }
}