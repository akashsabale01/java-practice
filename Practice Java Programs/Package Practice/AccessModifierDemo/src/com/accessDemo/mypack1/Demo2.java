package com.accessDemo.mypack1;

public class Demo2 {
    // Non-Subclass in within package
    // all variables/methods accessible except private
    Demo1 dObj = new Demo1();

    public void show() {
        System.out.println(dObj.a + dObj.b + dObj.c + dObj.d);
        // b not accessible as b is private
    }
}
