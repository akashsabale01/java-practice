package collectiondemo;

import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {
        /*
        - Keys Are Sorted
        - key value pair
        - Keys are always Unique
        - If Added same key then it updated old key value
        - unordered
        */

        Map<String, Integer> numbers =new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Five", 3);
        numbers.put("Six", 3);

//        if(!numbers.containsKey("Two")){
//            numbers.put("Two",22);
//        }

//        numbers.putIfAbsent("Two", 22);

        System.out.println(numbers);
//
//        for(Map.Entry<String, Integer> pair: numbers.entrySet()){
////            System.out.println(pair.getKey()+ " = " + pair.getValue());
//            System.out.println(pair);
//        }

//        for(String key: numbers.keySet()){
//            System.out.println(key);
//        }

//        for(Integer value: numbers.values()){
//            System.out.println(value);
//        }

//        System.out.println(numbers.containsKey("Three"));
//        System.out.println(numbers.containsValue(2));

//        System.out.println(numbers.isEmpty());
//        System.out.println(numbers.size());

        numbers.remove("One");

//        numbers.clear();

        System.out.println(numbers);
    }
}
