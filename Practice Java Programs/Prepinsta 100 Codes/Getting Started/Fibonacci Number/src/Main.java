public class Main {

    static int getNthFibonacciNum(int n){

        if(n==0 || n==1)    return n;

        int a = 0, b=1;

        for(int i=2; i<=n; i++){
            int nextTerm = a+b;
            int temp = b;
            a = b;
            b = nextTerm;
        }

        return b;
    }

    static int getNthFibonacciNumRecursive(int n){
        if(n==0 || n==1)
            return n;

        return getNthFibonacciNumRecursive(n-1)+ getNthFibonacciNumRecursive(n-2);
    }

    public static void main(String[] args) {

        // Fibonacci series = 0 1 1 2 3 5 8 13 21 ....

        int n = 7; // indexing start from 0

        System.out.println(getNthFibonacciNum(n));
        System.out.println(getNthFibonacciNumRecursive(n));
    }
}