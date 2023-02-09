package class20.Homework;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp = new Employee("Olya","Shibaeva",47, "translator");
        emp.showInfo();
        emp.getNo();

        FulltimeEmployee ft = new FulltimeEmployee("Irina","Semenova", 40,"realtor","female");
        ft.showInfo();
        ft.ifOld();

        ParttimeEmployee pt = new ParttimeEmployee("Milan", "Gnatuyk",15,"pupil", 5000);
        pt.showInfo();
        pt.showNo ();

        Tester ts = new Tester("Ivan", "Ivanov",50,"manager", "male", false);
        ts.showInfo();
        ts.goodOrBad();


    }
}
