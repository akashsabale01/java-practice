package collectiondemo;

import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        /*
            - Stores Values in the Binary Search Tree
            - All Values are in sorted form
            - Unique elements

            - O(log n) operations = remove, contains, add
            - TreeSet provides guaranteed log(n) time cost for the basic operations (add, remove and contains).
            log n time because of binary search

         */
        TreeSet<Integer> set = new TreeSet<>();

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

        set.remove(23);

//        System.out.println(set.contains(11));
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());

//        set.clear();

        System.out.println(set);
    }
}
