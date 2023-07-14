package collectiondemo;

import  java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {

        /*
           - Present in java.util;

           - It uses array internally

           - Variable sized array

           - It starts with an initial capacity and automatically grows as elements are added to it.
             The default initial capacity of an ArrayList is 10.

           - It grows like if size is n then size of new ArrayList is ( n+ n/2 + 1)



        */

//        ArrayList<Integer> arr = new ArrayList<>();
//
//        // append in arr
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//
//        arr.add(1, 10);
//
//        System.out.println(arr);
//
//        ArrayList<Integer> arr2 = new ArrayList<>();
//        arr2.add(20);
//        arr2.add(30);
//
////        arr.addAll(arr2);
//        arr.addAll(1,arr2);
//        System.out.println(arr.get(2));

        List<Integer> lst = new ArrayList<>();

        for(int i=1; i<=8; i++){
            lst.add(i*10);
        }

//        System.out.println(lst);

//        lst.remove(0); // remove element present at given index
//
//        lst.remove(Integer.valueOf(50)); // remove element having value like given

//        lst.clear();
//
//        System.out.println(lst.get(0));
//        lst.set(0,100);
//        System.out.println(lst.get(0));

//        System.out.println(lst.contains(30));

        System.out.println(lst);

        // Iterating ArrayList

//        for (int i = 0; i <lst.size() ; i++) {
//            System.out.print(lst.get(i) + " ");
//        }

//        for (Integer ele: lst){
//            System.out.print(ele + " ");
//        }

        // One Directional Iterator
//        Iterator<Integer> itr = lst.iterator();
//
//        while (itr.hasNext()){
//            System.out.print(itr.next() + " ");
//        }

        // Bi Directional Iterator ************

        // 1) Iterating Forward
//        ListIterator<Integer> bitr = lst.listIterator();
//
//        while (bitr.hasNext()){
//            System.out.print(bitr.next() + " ");
//        }

        // 2) Iterating Backword
//        ListIterator<Integer> bitr = lst.listIterator(lst.size());
//
//        while (bitr.hasPrevious()){
//            System.out.print(bitr.previous() + " ");
//        }

        // Using Lambdas with foreach
        lst.forEach(ele-> {
            System.out.print(ele + " ");
        });

    }
}
