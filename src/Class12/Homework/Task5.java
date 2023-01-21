package Class12.Homework;
/*Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
 Retrieve all values from that array using 2 different loops
* */
public class Task5 {
    public static void main(String[] args) {

        String[][] grocery = new String[4][3];
        String[] veggies = {"carrot", "tomato", "onion"};
        String[] fruits = {"cherry", "apple", "apricot"};
        String[] diary = {"milk", "yogurt", "cheese"};
        String[] sweets = {"pie", "cookies", "pancakes"};


        grocery[0] = veggies;
        grocery[1] = fruits;
        grocery[2] = diary;
        grocery[3] = sweets;


        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {

                System.out.println(grocery[i][j]);
            }
        }




            System.out.println("***********************************************");

                for (String[] array : grocery) {
                for (String food : array) {

                    System.out.println(food);
                }
            }


        }

    }




