package collectiondemo;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        /*
        - Deque is double ended queue, where we can insert or delete from both side of queue
        - Resizable-array implementation of the Deque interface
        - Most ArrayDeque operations run in amortized constant time. Exceptions include remove,
        - This class is likely to be faster than Stack when used as a stack, and
          faster than LinkedList when used as a queue



         */

//        ArrayDeque<Integer> adq = new ArrayDeque<>();
//
//       // the add() method will throw an exception, the offer() method returns false

//        // here offer() is same as offerLast()
//        adq.offer(20);
//        adq.offerFirst(10);
//        adq.offerLast(30);
//        adq.offer(40);
//
//        System.out.println(adq);

        // peek() is same as peekFirst() , because in queue element from front will be deleted
//        System.out.println(adq.peek());
//        System.out.println(adq.peekFirst());
//        System.out.println(adq.peekLast());

        // poll() is same as pollFirst() , because in queue element from front will be deleted
//        System.out.println(adq.poll() + " is deleted");
//        System.out.println("After poll() " + adq);
//
//        System.out.println(adq.pollFirst() + " is deleted");
//        System.out.println("After pollFirst() " + adq);
//
//        System.out.println(adq.pollLast() + " is deleted");
//        System.out.println("After pollLast()   " + adq);

        // Implementing Stack using Deque

        ArrayDeque<Integer> stk = new ArrayDeque<>();

        stk.offerLast(20);
        stk.offerLast(30);
        stk.offerLast(40);
        stk.offerLast(50);

        System.out.println(stk);

        System.out.println(stk.peekLast() + " is Top of Stack");

        System.out.println(stk.pollLast() + " element deleted");

        System.out.println("After pollLast() : " + stk);



    }
}
