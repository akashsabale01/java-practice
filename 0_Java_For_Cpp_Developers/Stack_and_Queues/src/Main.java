import java.util.ArrayDeque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Stack
        Stack<Integer> stk = new Stack<>();

        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

        System.out.println(stk);

        // .peek() gives top of Stack
        System.out.println(stk.peek());
        System.out.println(stk);

        System.out.println(stk.pop());
        System.out.println(stk);

        // Queue
        ArrayDeque<Integer> que = new ArrayDeque<>();

        que.addLast(11);
        que.addLast(12);
        que.addLast(13);
        que.addLast(14);

        System.out.println(que);

        System.out.println(que.getFirst());
        System.out.println(que);

        System.out.println(que.removeFirst());
        System.out.println(que);




    }
}