package mypackage1;

public class Demo2{

    // Non Subclass Within same package cannot access private values

    Demo1 demo1Obj = new Demo1();

    public void show(){
        System.out.println(demo1Obj.a+ demo1Obj.b +demo1Obj.c+ demo1Obj.d);
    }
}