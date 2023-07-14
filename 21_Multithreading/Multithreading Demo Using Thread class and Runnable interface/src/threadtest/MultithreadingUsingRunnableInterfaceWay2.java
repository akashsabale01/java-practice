package threadtest;

import java.lang.Thread ;
import java.lang.Runnable;

public class MultithreadingUsingRunnableInterfaceWay2 implements Runnable {

    // override run method of Runnable Interface
    public void run(){
        int i=1;
        while(i<=100){
            System.out.println(i + " Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        MultithreadingUsingRunnableInterfaceWay2 obj = new MultithreadingUsingRunnableInterfaceWay2();
        Thread thd = new Thread(obj); // this will create new thread
        thd.start(); // run new thread

        // here main thread will execute simultaneously with new thread
        int i=1;
        while(i<=100){
            System.out.println(i + " world");
            i++;
        }
    }
}
