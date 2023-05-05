package com.accessDemo.mypack2;

import com.accessDemo.mypack1.Demo1;

public class Demo4 extends Demo1 {
    // Subclass in different package
    // all variables/methods accessible except private,default

    public void show() {
        System.out.println(a + b + c + d);
        // b not accessible as b is private
        // a not accessible as a is default
    }
}
}
