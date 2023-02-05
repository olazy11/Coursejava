package class19.Homework;
/*Write a Java program called Teacher.
Identify features and 4 behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
Test all 4 classes
* */
public class Teacher {
    String name;
    int age;
    public void teaching() {
        System.out.println("I love teaching");
    }
    public void practicing() {
        System.out.println("I encourage students to practice a lot");
    }
    public void analyze() {
        System.out.println("I prefer students do their own analysis");
    }
    public void review() {
        System.out.println("review is a must!");
    }
}
class MathTeacher extends Teacher {
    String subject;

public void calculate () {
    System.out.println("you have to calculate well");
}


}

class ChemistryTeacher extends Teacher {
    String degree;
    public void formulas () {
        System.out.println("learn a lot of formulas");
    }
}
class PianoTeacher extends Teacher {
    String skills;

    public void playInstrument () {
        System.out.println("I can play 3 instruments ");
    }
}