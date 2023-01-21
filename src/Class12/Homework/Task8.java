package Class12.Homework;
/*Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored
* */
public class Task8 {
    public static void main(String[] args) {
        String[][] countries = new String[5][3];
        String[] northAmerican = {"Cuba", "Mexico", "Canada"};
        String[] southAmerican = {"Chile", "Colombia", "Ecuador"};
        String[] europen = {"Italy", "France", "Germany"};
        String[] asian = {"China", "India", "Indonesia"};
        String[] african = {"Morocco", "Egypt", "Nigeria"};

        countries[0] = northAmerican;
        countries[1] = southAmerican;
        countries[2] = europen;
        countries[3] = asian;
        countries[4] = african;



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
            }
        }


            }

        }














