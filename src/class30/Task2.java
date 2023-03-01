package class30;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*Create a map of countries with its capital that will store countries in alphabetical order.
                Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.
* */
public class Task2 {
    public static void main(String[] args) {
        TreeMap <String, String> countries = new TreeMap<>();
        countries.put("Russia","Moscow");
        countries.put("UK","London");
        countries.put("Wales", "Cardiff");
        countries.put("Scotland", "Edinburgh");

        /*Set<Map.Entry<String, String>> entrySet =countries.entrySet();*/
        var entrySet =countries.entrySet(); //replaces the above
        for (var entry: entrySet) {
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
        var iterator = countries.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey() + " "+entry.getValue());
        }




}

    }

