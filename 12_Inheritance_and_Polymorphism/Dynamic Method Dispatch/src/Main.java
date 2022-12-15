
class Base{

    public void show1(){
        System.out.println("Base Class show1() Method Called");
    }

    public void display(){
        System.out.println("Base Class Display() Method Called");
    }
}

class Derived extends Base{

    public void display(){
        System.out.println("Child Class Display() Method Called");
    }

    public void show2(){
        System.out.println("Child Class show2() Method Called");
    }
}

public class Main {
    public static void main(String[] args) {
        // Here Display() of Base class is overrided in Derived Class

        /*
        Dynamic Method Dispatch means calling Object of Derived Class using Base class reference
        A Super Class Reference can hold the Object of Sub Class,
        but it can call only those methods which are present in super class

        Super Class reference can have Object of Sub Class but a Sub Class reference cannot have Super Class Object.

        Dynamic Method Dispatch is used to Implement Runtime Polymorphism

        Methods are called depending on the object not the reference then the overridden object is called it is Runtime Polymorphism.

        Objects are created at Runtime in heap by using new keyword

        Dynamic Method Dispatch means calling a Method dynamically because program make the decision at runtime for which object to be called.

        * */

        Base baseObj1 = new Derived();
        baseObj1.display();
        baseObj1.show1();

        // Below line Gives Error as Base class reference cannot access methods
        // which are not present in Base class, but they are present in Derived class

//        baseObj1.show2();

    }
}