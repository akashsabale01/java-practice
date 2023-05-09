import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> arr1 = new LinkedList<>();
        LinkedList<Integer> arr2 = new LinkedList<>(List.of(30,40,50,60));

        arr1.add(20);
        arr1.add(0,10);
        arr1.addAll(arr2);
//        arr1.addAll(0, arr2);

//        System.out.println(arr2.contains(50));

//        System.out.println(arr1.get(2));
//        arr1.set(1,15);

//        arr1.add(40);
//        System.out.println(arr1.indexOf(40));
//        System.out.println(arr1.lastIndexOf(40));

//        arr1.removeAll(arr2); // removes matching element only
//        arr1.retainAll(arr2); // removes all element other than matching element

        // Extra methods other than ArrayList in LinkedList class
        arr1.addFirst(2);
        arr1.addLast(100);

        // Printing LinkedList
        System.out.println(arr1);
    }
}