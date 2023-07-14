package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(32);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(232);
        list.add(2);
        list.add(76);

        System.out.println("List = " + list);

//        System.out.println("Min element = " + Collections.min(list));
//
//        System.out.println("Max element = " + Collections.max(list));
//
//        System.out.println("Frequency of element = " + Collections.frequency(list, 13));

//        Collections.sort(list);
//
//        System.out.println("List = " + list);

        // Sort in Descending order
        Collections.sort(list, Comparator.reverseOrder());

        System.out.println("List = " + list);



    }
}
