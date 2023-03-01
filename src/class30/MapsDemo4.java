package class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> makeup = new HashMap<>();
        makeup.put("Lipstick", 50.0);
        makeup.put("Foundation", 40.0);
        makeup.put("mascara", 70.0);
        makeup.put("eyeliner", 12.2);
        makeup.put("blushon", 12.2);
        //to get all keys we can use keySet Method from Map Interface
        Set<String> allKeys = makeup.keySet();
        System.out.println(allKeys);

        for (String s : allKeys) {
            System.out.println(s);}


            allKeys.removeIf(x -> x.length()>7);//delete all entries which have key size is greater than 7
        System.out.println(allKeys);//prints keys only
        System.out.println(makeup);//prints keys and values that are left

        }
    }

