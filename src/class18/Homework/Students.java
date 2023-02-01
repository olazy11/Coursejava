package class18.Homework;
/*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
 Inside your class also have a method to Calculate Average Grade.
 Test Student class for 5 different students with different marks.
  Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.

* */
public class Students {
    String name;
    double grade1;
    double grade2;
    double grade3;
    double averageGrade;

    public Students (String StName, double Stgrade1, double Stgrade2, double Stgrage3) {
        name = StName;
        grade1 = Stgrade1;
        grade2 = Stgrade2;
        grade3 = Stgrage3;
   }


        public double calculateAverageGrade () {
            averageGrade = (grade1 + grade2 + grade3) / 3;
            return averageGrade;
        }


        void getInfo () {
            System.out.println("The average grade of " + name + " is " + averageGrade);
        }

    }


