package mypackage2;
import mypackage1.Demo1;

public class Demo4 extends Demo1{

    // Subclass in Different package cannot access private,default values

    public void showValues(){
        System.out.println(a+ b+ c+ d);
    }
}