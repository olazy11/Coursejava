package class30;

import java.util.TreeMap;

/*Create a map of countries with its capital that will store countries in alphabetical order.
                Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.
* */
public class MapsDemo {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Russia","Moscow");
        countries.put("UK","London");
        countries.put("Wales", "Cardiff");
        countries.put("Scotland", "Edinburgh");

        var values =countries.values();//Java 10
        for (var value: values) {

        }
        System.out.println(values);

        var iterator = countries.values().iterator();
        while (iterator.hasNext())
        {
            var value = iterator.next();
            System.out.println(value);
        }
    }
}
