package class19.Homework;
/*Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
* */


public class A {
    String name;

    public void yourName() {
        System.out.println("My name is Mary");
    }
}

    class B extends A {
        int age;

        public void yourAge() {
            System.out.println("my age is 60");
        }
    }


            class C extends B {
                String gender;

                public void yourGender() {
                    System.out.println("My gender is male");
                }

            }





