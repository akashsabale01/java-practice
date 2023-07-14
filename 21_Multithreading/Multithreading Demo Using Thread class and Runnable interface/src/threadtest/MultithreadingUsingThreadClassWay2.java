package threadtest;

import java.lang.Thread;

public class MultithreadingUsingThreadClassWay2 extends Thread {

    // override run method of Thread class
    public void run(){
        int i=1;
        while(i<=100){
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        MultithreadingUsingThreadClassWay2 obj = new MultithreadingUsingThreadClassWay2(); // this will create new thread
        obj.start(); // run new thread

        // here main thread will execute simultaneously with new thread
        int i=1;
        while(i<=100){
            System.out.println(i + " world");
            i++;
        }
    }
}
