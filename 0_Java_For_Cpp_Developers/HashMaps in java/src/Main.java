import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> hMap = new HashMap<>();

        // Most of operation of hashmap are of O(1) time complexity

        // add key,value to HashMap
        hMap.put("India", 180);
        hMap.put("China", 200);
        hMap.put("Uk", 100);
        hMap.put("Sri Lanka", 70);

        System.out.println(hMap);

        // get
        System.out.println(hMap.get("India"));
        System.out.println(hMap.get("Uk"));
        System.out.println(hMap.get("Germany"));

        // contains key
        System.out.println(hMap.containsKey("Sri Lanka"));
        System.out.println(hMap.containsKey("Germany"));

        // keySet for getting key in Hashmap
        Set<String> stk = hMap.keySet();
        System.out.println(stk);

        // Print key,value pair
        for(String key: hMap.keySet()){
            int val = hMap.get(key);
            System.out.println(key +" "+ val);
        }

    }
}