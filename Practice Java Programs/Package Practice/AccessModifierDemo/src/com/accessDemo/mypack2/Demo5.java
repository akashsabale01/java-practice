package com.accessDemo.mypack2;

import com.accessDemo.mypack1.Demo1;

public class Demo5 {

    void show() {
        // Non-Subclass in Different package
        // only public variables/methods accessible
        Demo1 demo1 = new Demo1();

        System.out.println(demo1.a + demo1.b + demo1.c + demo1.d);

        demo1.displaySum();

    }
    //    public static void main(String[] args) {
//        // Non-Subclass in Different package
//        // only public variables/methods accessible
//
//        // Note: to call method displaySum() from demo1 we require main method
//        // you cannot have a method call outside of a method or block in Java, it needs to be inside a method or block, such as a main method.
//
//        Demo1 demo1 = new Demo1();
//
//        demo1.displaySum();
//    }

//        System.out.println(d1.a + d1.b + d1.c + d1.d);
}
