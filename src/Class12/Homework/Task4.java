package Class12.Homework;
/*Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops
* */
public class Task4 {
    public static void main(String[] args) {
        String[][] cars = new String[4][3];
        String[] american = {"Ford", "Jeep", "Tesla"};
        String[] german = {"BMW", "FW", "Audi"};
        String[] korean = {"Kia", "Hyundai", "Daewoo"};
        String[] italian = {"Ferrari", "Maserati", "Lamborghini"};


        cars[0] = american;
        cars[1] = german;
        cars[2] = korean;
        cars[3] = italian;


        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {

                System.out.print (cars[i][j] + " ");
                System.out.println();
            }
        }


        System.out.println("***********************************************");


        for (String[] array : cars) {
            for (String brends : array) {

                System.out.println(brends);
            }
        }


    }

}







