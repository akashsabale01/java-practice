package collectiondemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        /*
         - Ordered collection ***IMP
            which is the order in which elements were inserted into the set (insertion-order).
         - No Duplicates allowed
         - No indexing
         - internally uses LinkedList

         - LinkedHashSet uses hashes for each value, each value have unique hash



         */

        Set<Integer> set = new LinkedHashSet<>();

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
