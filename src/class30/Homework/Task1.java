package class30.Homework;



import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> bestStore= new LinkedHashMap<>();
        bestStore.put ("876543","Table");
        bestStore.put ("099476","Chair");
        bestStore.put ("876583","Bed");
        bestStore.put ("876547","Cupboard");

        Set<Map.Entry<String, String>> entrySet = bestStore.entrySet();
        for (Map.Entry<String, String> x: entrySet) {
            System.out.println(x.getKey()+" "+ x.getValue());
        }
        {

        }

    }
}
