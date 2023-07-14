package collectiondemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        /*
           - present in java.util
           - Extends Vector class

           The Stack class represents a last-in-first-out (LIFO) stack of objects.
           It extends class Vector with five operations that allow a vector to be treated as a stack.

           The usual push and pop operations are provided, as well as a method to peek at the top item on the stack, a method to test for whether the stack is empty, and a method to search the stack for an item and discover how far it is from the top.

           When a stack is first created, it contains no items.

           A more complete and consistent set of LIFO stack operations is provided by the Deque interface and its implementations, which should be used in preference to this class. For example:
           Deque<Integer> stack = new ArrayDeque<Integer>();

         */
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

//        System.out.println(animals);

        System.out.println(animals.peek());

        animals.pop();

        System.out.println(animals.peek());

        System.out.println(animals.isEmpty());

        System.out.println(animals.size());

        System.out.println(animals);
    }
}
