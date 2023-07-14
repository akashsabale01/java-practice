package threadtest;

import java.lang.Thread;
import java.lang.Runnable;

class MyRunnable implements Runnable{
    // override run method of Runnable Interface
    public void run(){
        int i=1;
        while(i<=100){
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class MultithreadingUsingRunnableInterfaceWay1 {
    public static void main(String[] args) {

        MyRunnable myObj = new MyRunnable();
        Thread thd = new Thread(myObj); // this will create new thread
        thd.start();// run new thread

        // here main thread will execute simultaneously with new thread
        int i=1;
        while(i<=100){
            System.out.println(i + " world");
            i++;
        }
    }
}
