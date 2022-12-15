package mypackage1;

public class Demo3 extends Demo1{

    // Subclass Within same package cannot access private values

    public void showValues(){
        System.out.println(a+ b+ c+ d);
    }
}