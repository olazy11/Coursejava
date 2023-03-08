package reps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/*Key is 1 item apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi
```*/

public class m202 {
    public static void main(String[] args) {
        Map<String, String> fruits = new TreeMap<>();

        fruits.put("1 item = ", "apple");
        fruits.put("2 item = ", "banana");
        fruits.put("3 item = ", "pear");
        fruits.put("4 item = ", "tomato");
        fruits.put("5 item = ", "mango");
        fruits.put("6 item = ", "kiwi");
        Set< Map.Entry<String,String>> a = fruits.entrySet();
        for (Map.Entry<String,String> x: a){
            System.out.println("Key is "+ x.getKey()+ "and values is "+x.getValue());
        }
    }
}
