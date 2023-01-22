package ProjectBasic1;
/*11)Write a program to print out duplicate elements from an Array of Strings? (edited)*/


public class Task11 {
    public static void main(String[] args) {
        String[] x = {"Max", "Daniel", "Oliver", "Mat", "Max"};
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {
                if (x[i].equals(x[j])) {

                    System.out.println(x[i]);
                }

            }
        }
    }
}



