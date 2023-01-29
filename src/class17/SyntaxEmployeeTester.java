package class17;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {

        SyntaxEmployee employee1 = new SyntaxEmployee();
        employee1.empId = 123456;
        employee1.salary =100.12;

        SyntaxEmployee employee2 = new SyntaxEmployee();
        employee2.empId = 1011;
        employee2.salary =200.32;

        System.out.println(employee1.empId+" " + employee1.salary+" " + employee1.CEO);
        System.out.println(employee2.empId +" " + employee2.salary+" " + employee2.CEO);

        System.out.println(employee1.empId+" " +  employee1.salary+" " + SyntaxEmployee.CEO);
        System.out.println(employee2.empId +" " + employee2.salary+" " + SyntaxEmployee.CEO);

    }
}
