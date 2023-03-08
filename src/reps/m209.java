package reps;

import java.util.*;


/*#
Step 5: Add orangeMap to dataList.

Step 6: Create a loop from dataList.

Step 7: Retrieve each Key and store is in a variable.

Step 8: calculate the subtotal of each object.

Step 9: Print the values of each Iteration same as shown below in Output example.

Step 10: Calculate the Sum of subtotal. and store is in variable called totalPurchase.

Step 11: After Loop Print the value of Total Purchase.

**NOTE: as the values are Object you have to do casting properly while retrieving from for each map.**

Output:

Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0

Items: Orange Price: 21.99 Quantity: 10.0 SubTotal: 219.89999999999998

Your Purchase total : 419.9

* */

public class m209 {
    public static void main(String[] args) {


        List<Map<String, Object>> dataList = new ArrayList<>();


        Map<String, Object> appleMap = new HashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);

        dataList.add(appleMap);

        Map<String, Object> orangeMap = new HashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);

        dataList.add(orangeMap);

        double totalPurchase = 0.0;

        for (Map<String, Object> item : dataList) {

            String itemName = (String) item.get("Items");
            double price = (double) item.get("Price");
            double quantity = (int) item.get("Quantity");

            double subtotal = price * quantity;


            System.out.println("Items: " + itemName + " Price: " + price + " Quantity: " + quantity + " SubTotal: " + subtotal);
            System.out.println();

            totalPurchase += subtotal;
        }

        System.out.println("Your Purchase total : " + totalPurchase);
}
}
















