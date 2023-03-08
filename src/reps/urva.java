package reps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class urva {
    public static void main(String[] args) {
        List<Map<String, Object>> dataList = new ArrayList<>();
        //2
        Map<String, Object> appleMap = new HashMap<>();
        appleMap.put("Item", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);
        //3
        dataList.add(appleMap);
        //4
        Map<String, Object> orangeMap = new HashMap<>();
        orangeMap.put("Item", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);
        dataList.add(orangeMap);

        for (Map<String, Object> k : dataList) {
            String item = (String) k.get("Item");
            Double price1 = (Double) k.get("Price");
            Integer quantity1 = (Integer) k.get("Quantity");
            Double total = price1 * quantity1;

            double totalPurchase=0;
            if (k.get("Item") == "Apple") {
                System.out.println("Item: Apple Price: " + price1 + " Quantity: " + quantity1 + " SubTotal: " + total);
                totalPurchase += total;
            } else if (k.get("Item") == "Orange") {
                System.out.println("Item: Orange Price: " + price1 + " Quantity: " + quantity1 + " SubTotal: " + total);
                totalPurchase += total;
            }

        }

    }
}