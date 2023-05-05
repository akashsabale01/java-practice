package com.accessDemo.mypack1;

public class Demo1 {

    // default - accessible inside same package
    int a = 10;

    // private - accessible inside same class only
    private int b = 20;
    protected int c = 30;
    public int d = 40;

    public void displaySum() {
        System.out.println(a + b + c + d);
    }
}
