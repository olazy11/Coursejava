package class30;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {
        HashMap <String,Double> fruit = new HashMap<>();//not in aplphabetic order
        fruit.put ("Apple", 1.99);
        fruit.put ("Grapes", 2.99);
        fruit.put ("Pine Apple", 4.99);
        fruit.put ("Banana", 1.99);
        fruit.put ("Apple", 1.99);//if you replace, it will replace duplicate
      fruit.put(null, null);
        System.out.println(fruit);

        HashMap <String, Double> makeup = new HashMap<>();
        makeup.put("Lipstick", 50.0);
        makeup.put("Foundation", 40.0);
        makeup.put ("mascara",70.0);
        makeup.put("eyeliner", 12.2);
        makeup.put ("blushon", 12.2);

        HashMap<String, Double> groceries = new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeup);
        System.out.println(groceries);

    }
}
