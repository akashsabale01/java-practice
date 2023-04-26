import java.util.Arrays;

class StackOverflowException extends Exception{

    public String toString() {
        return "Stack Overflow , Stack is Full -> No more space to push elements";
    }
}

class StackUnderflowException extends Exception{

    public String toString() {
        return "Stack Underflow Exception, Stack is Empty,So can't pop elements";
    }
}

class Stack{

    public int size;
    public int top = -1;
    public int[] arr;

    public Stack(int sz){
        size = sz;
        arr = new int[sz];
    }

    public void push(int element) throws StackOverflowException {
        if(top == arr.length-1)
            throw new StackOverflowException();

        top++;
        arr[top] = element;
    }

    public int pop() throws StackUnderflowException{
        if(top == -1)
            throw new StackUnderflowException();

        int element = arr[top];
        top--;
        return element;
    }

    public void printStack(){

        if(top == -1){
            System.out.println("Array = { }");
            return;
        }

        System.out.print("Array = { ");

        for(int i=0; i<=top; i++)
            System.out.print(arr[i] + " ");

        System.out.println("}");
    }
}

public class Main {
    public static void main(String[] args) {

        Stack stk = new Stack(5);

        try {
            stk.push(11);
            stk.push(22);
            stk.push(33);
            stk.push(44);
            stk.push(55);
//            stk.push(33); // after inserting this we will get StackOverflowException

            stk.printStack();

            System.out.println("Popped elements are :");
            System.out.println(stk.pop());
            System.out.println(stk.pop());
            System.out.println(stk.pop());
            System.out.println(stk.pop());
            System.out.println(stk.pop());
            System.out.println(stk.pop()); // here pop()  will raise StackOverflowException

            stk.printStack();
        }
        catch (StackOverflowException e){
            System.out.println(e);
        }
        catch (StackUnderflowException e){
            System.out.println(e);
        }
    }
}