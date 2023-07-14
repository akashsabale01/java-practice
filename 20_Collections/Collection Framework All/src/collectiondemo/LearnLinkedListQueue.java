package collectiondemo;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        // Queue Follows FIFO

        Queue<Integer> queue = new LinkedList<>();

//        offer() - Inserts the specified element into the queue.
//        If the task is successful, offer() returns true, if not it returns false.

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

//        add() - Inserts the specified element into the queue. If the task is successful, add() returns true,
//        if not it throws an exception.

//        queue.add(10);

//        System.out.println(queue);
//
//        // returns and removes the first element from the linked list
//        queue.poll();

//        remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty

//        System.out.println(queue.peek());

        System.out.println(queue);



    }
}
