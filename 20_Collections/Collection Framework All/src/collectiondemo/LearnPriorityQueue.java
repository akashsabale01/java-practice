package collectiondemo;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        // Default is Min Heap, Priority given to min element

//        Queue<Integer> pq = new PriorityQueue<>();
//
//        pq.offer(30);
//        pq.offer(2);
//        pq.offer(15);
//        pq.offer(1);
//
//        System.out.println(pq);
//
//        System.out.println(pq.peek()); // gives element which have high priority & poll first
//
//        pq.poll();
//
//        System.out.println(pq);

        // Default is Max Heap, Priority given to max element

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(30);
        pq.offer(2);
        pq.offer(15);
        pq.offer(1);

        System.out.println(pq);

        System.out.println(pq.peek()); // gives element which have high priority & poll first

        pq.poll();

        System.out.println(pq);




    }
}
