

class Base{
    public void display(){
        System.out.println("Base Class Display() Method Called");
    }
}

class Derived extends Base{
    public void display(){
        System.out.println("Child Class Display() Method Called");
    }
}

class Test{
    public int max(int a, int b){
        return (a>b)? a:b;
    }

    public int max(int a, int b, int c){
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b;
        else return c;
    }
}


public class Main {
    public static void main(String[] args) {

        // Method Overriding - Runtime Polymorphism
        // Achieved using Dynamic Method Dispatch
        Base baseObj1 = new Derived();
        baseObj1.display();

        // Method Overloading - Compile Time Polymorphism
        Test testObj = new Test();
        System.out.println(testObj.max(12,24));
        System.out.println(testObj.max(34,211,245));
    }
}