
class Test{
    static int x = 10;
    int y = 30;

    // Instance(non-static) method can access static variables & instance variables & static methods & instance method
    public void show(){
        System.out.println("Static variable x value = "+ x); // non-static method can access static variables
        System.out.println("Instance variable y value = "+ y);// non-static method can access non-static variables
//        display();// non-static method can access static methods

    }

    // Static method can access only static variables & static methods
    public static void display(){
        System.out.println("Static variable x value in Static method = "+ x); // static method can access static variables
//        System.out.println( y); // static method cannot access non-static variables, this gives error
//        show();// static method cannot access non-static methods, this gives error
    }
}


public class Main {
    public static void main(String[] args) {

        Test obj1= new Test();
        obj1.x = 55; // changing value of static variable
        obj1.y = 100; // changing value of instance variable
        obj1.show();

        obj1.display(); //Static member 'Test.display()' accessed via instance reference

        Test.display(); // Static member 'Test.display()' accessed directly using Test class name

        System.out.println();

        Test obj2= new Test();
        obj2.show();
        Test.display();

    }
}