package class19.Homework;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.teaching();
        teacher1.name = "Olya";
        teacher1.analyze();
        teacher1.practicing();
        teacher1.review();
        System.out.println("My name is " + teacher1.name);

        MathTeacher teacher2 = new MathTeacher();
        teacher2.subject ="Math";
        teacher2.name = "Natasha";
        teacher2.teaching();
        teacher2.analyze();
        teacher2.review();
        teacher2.practicing();
        teacher2.calculate();
        System.out.println("My name is " + teacher2.name+ " my subject is "+ teacher2.subject);


        ChemistryTeacher teacher3 = new ChemistryTeacher();
        teacher3.degree = "PHd in Science";
        teacher3.teaching();
        teacher3.name = "Lida";
        teacher3.analyze();
        teacher3.practicing();
        teacher3.review();
        teacher3.formulas();
        System.out.println("My name is " + teacher3.name + " and my degree is "+teacher3.degree );

        PianoTeacher teacher4 = new PianoTeacher();
        teacher4.skills = "3 instruments";
        teacher4.teaching();
        teacher4.name = "Nadia";
        teacher4.analyze();
        teacher4.practicing();
        teacher4.review();
        teacher4.playInstrument();
        System.out.println("My name is " + teacher4.name + " my skills set is "+ teacher4.skills);



    }
}