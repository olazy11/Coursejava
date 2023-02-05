package class19.Homework;

public class Atest {
    public static void main(String[] args) {

        A grandmother = new A();
        grandmother.name = "Baba";
        grandmother.yourName();
        System.out.println(grandmother.name );


        B mother = new B();
        mother.age = 60;
        mother.name = "Mama";
        mother.yourAge();
        System.out.println( mother.age + mother.name);

        C son = new C();
       son.age = 17;
       son.name = "Milan";
        son.yourAge();

son.gender = "male";
son.yourGender();
        System.out.println( son.name + son.age + son.gender);


    }
}
