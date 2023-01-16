package class10;

public class Arrays2 {
    public static void main(String[] args) {
        String[] names = {"Slava", "Safi", "Jason", "Anna", "Joseph"};//отсчет с нуля
        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]); //error 500 - no names for index, error -5 = index cannot be negative
        }
    }
}
