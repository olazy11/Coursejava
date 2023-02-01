package class18.Homework;
/*/*Write a Student class   that have instance variables name and address.
Create a constructor that will initialize those variables.
Print name & address of given  student using displayInfo method.
* */
public class Student {
    String name;
    String address;

    Student (String stName, String stAddress){
        this.name =stName;
        this.address =stAddress;

    }
    void displayInfo () {
        System.out.println("Student name is "+ name + " and his address is " + address);
    }

    public static void main(String[] args) {
        Student st1 = new Student("Zaur", "101 Gagarina");
        st1.displayInfo();
    }
}
