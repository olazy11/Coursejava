package class20.Homework;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Olya","Shibaeva",47, "translator");
        emp.showinfo();
        FulltimeEmployee ft = new FulltimeEmployee("Irina","Semenova", 40,"realtor","female");
        ft.ifOld();
        ft.showinfo();
        ParttimeEmployee pt = new ParttimeEmployee("Milan", "Gnatuyk",15,"pupil", 5000);
        System.out.println("number of employees in PartimeEmployee class is " +pt.getEmpCount());
        pt.showinfo();
        Tester ts = new Tester("Ivan", "Ivanov",50,"manager", "male", false);
        ts.showinfo();
        ts.goodOrBad();


    }
}
