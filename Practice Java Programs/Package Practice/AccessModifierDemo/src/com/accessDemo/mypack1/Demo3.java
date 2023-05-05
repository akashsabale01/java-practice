package com.accessDemo.mypack1;

import com.accessDemo.mypack1.Demo1;

public class Demo3 extends Demo1 {
    // Subclass in within package
    // all variables/methods accessible except private

    public void show() {
        System.out.println(a + b + c + d);
        // b not accessible as b is private
    }
}
}
