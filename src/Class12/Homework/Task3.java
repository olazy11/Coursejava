package Class12.Homework;
/*Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
Then your program should print name of the students that has A and B grade (edited)
[05:00]

* */
public class Task3 {
    public static void main(String[] args) {

        String[][] namesAndGrades = {{"Tom", "Greg", "Samanta", "Saur"},
                {"A", "B", "C", "D"},
        };
        for (int i = 0; i < namesAndGrades.length; i++) {
            for (int j = 0; j < namesAndGrades[i].length; j++) {
                if (namesAndGrades[i][j].equals("A")) {
                    System.out.println(namesAndGrades[0][j] + " has A grade ");

                }else if (namesAndGrades[i][j].equals("B")) {
                        System.out.println(namesAndGrades[0][j] + " has B grade ");
                    }
                }
                System.out.println();
            }
        }
    }



