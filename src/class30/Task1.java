package class30;

import java.util.HashMap;

/*Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
* */
public class Task1 {
    public static void main(String[] args) {
        HashMap <Integer, String> buldings = new HashMap<>();
        buldings.put(1, "Neibours");
        buldings.put(2, "SHL");
        buldings.put(3, "LUKOIL");
        buldings.put (4, "Mammoet");
        buldings.put (5, "Rosneft");
        buldings.put (6, "Whetherford");
        buldings.put (7, "Shlumberger");
        System.out.println(buldings.size());
        buldings.replace(4, "Shell");
        buldings.remove(7);
        System.out.println(buldings);

    }
}
