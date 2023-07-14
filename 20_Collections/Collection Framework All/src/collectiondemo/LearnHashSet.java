package collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        /*
         - No Duplicates allowed
         - Unordered collection
         - No indexing
         - HashSet uses hashes for each value, each value have unique hash
         - O(1) operations = (add, remove, contains and size)
         - Note that this implementation is not synchronized

         */

        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(99);
        set.add(11);
        set.add(2);

        // adding duplicates values & No effect
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(2);

        System.out.println(set);

//        set.remove(23);

//        System.out.println(set.contains(11));
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());

        set.clear();

        System.out.println(set);


    }
}
