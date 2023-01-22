package Class12.Homework;
/*Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored
* */
public class Task8 {
    public static void main(String[] args) {
        String[][] countries = { {"Cuba", "Mexico", "Canada"},
                                 {"Chile", "Colombia", "Ecuador"},
                                 {"Italy", "France", "Germany"},
                                  {"China", "India", "Indonesia"},
                                  {"Morocco", "Egypt", "Nigeria"}};
        int count = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                count++;
                System.out.println(countries[i][j]);
            }
        }
        System.out.println(count);

        System.out.println("***********************************************");


        for (String[] array : countries) {
            for (String countires : array) {

                System.out.println(countires);
                count++;
                System.out.println(count);
            }
        }


            }

        }














