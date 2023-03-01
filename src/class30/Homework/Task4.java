package class30.Homework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        Set<String> clothes = new TreeSet<>();
        clothes.add("dress");
        clothes.add("jeans");
        clothes.add("top");
        clothes.add("Tee");
        clothes.add("skirt");
        /*String result = String.join(",", clothes);
            System.out.println(result);*/
        StringBuilder bld = new StringBuilder();
        for (String val : clothes) {
                bld.append(val+ ",");

        }
        System.out.println(bld);
        }

    }

