package class10.Homework;
/* Create an array of countries.
 While retrieving all values from an array print capital
 for each country choose any five countries.*//*{"Italy","Portugal","Spain", "UK", "Netherlands", }*/
public class Task6 {
    public static void main(String[] args) {
        String[] countries = {"Italy", "Portugal", "Spain", "UK", "Netherlands"};

        String[] capitals = new String[5];
        capitals[0] = "Milan";
        capitals[1] = "Lisbon";
        capitals[2] = "Madrid";
        capitals[3] = "London";
        capitals[4] = "Amsterdam";

        for (int i = 0; i < countries.length; i++) {

            for (int j = 0; j < capitals.length; j++) {

                System.out.println("The capital of " + countries[i] + " is " + capitals[j]);
                i++;
            }
        }
    }
}
