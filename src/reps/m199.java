package reps;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class m199 {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("null");
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Sumair");

        for (String x: names) {
            System.out.println(x);
        }

        Iterator it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
