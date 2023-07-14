package collectiondemo;

import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
        /*
            The LinkedList class of the Java collections framework provides  functionality of the linked list data structure (doubly linked-list).

            Elements in linked lists are not stored in sequence. Instead, they are scattered and connected through links (Prev and Next).




         */
        LinkedList<Integer> llst = new LinkedList<>();

        // append in arr
        llst.add(10);
        llst.add(20);
        llst.add(30);
        llst.add(40);
        llst.add(50);

//        llst.add(1, 100);

        System.out.println(llst);

//        System.out.println(llst.get(1));

//        llst.set(0,222);
        llst.remove(1);
        llst.remove(Integer.valueOf(40));

        System.out.println(llst);

        // Iterate LinkedList same as ArrayList

    }
}
