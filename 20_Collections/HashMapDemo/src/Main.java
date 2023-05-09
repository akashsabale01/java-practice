import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<String, String>();

        // Add key-value pair in HashMap
        countries.put("India", "Delhi");
        countries.put("USA", "Washington DC");
        countries.put("Russia", "Moscow");
        countries.put("Sri Lanka", "Colombo");

        // Remove
//        countries.remove("Russia");

//        System.out.println(countries.containsKey("India"));
//        System.out.println(countries.containsValue("Colombo"));

//        System.out.println(countries.get("India"));

//        System.out.println(countries.isEmpty());
//
//        System.out.println(countries.size());

//        countries.putIfAbsent("India", "Mumbai"); // put value if key is absent

        // Update value
//        countries.replace("India", "Mumbai");

//        countries.clear();

//        // Print Keys
//        System.out.println(countries.keySet());
//
//        // Print Values
//        System.out.println(countries.values());

        // return set view of key-value pairs using entrySet()
//        System.out.println(countries.entrySet());

        /*
            System.out.println(countries.entrySet()); is same as System.out.println(countries);
        */
        // print
        System.out.println(countries);

        for (String key : countries.keySet()) {
            System.out.println(key + " = " + countries.get(key));
        }
    }
}