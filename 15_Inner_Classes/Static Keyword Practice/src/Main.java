
class Test{
    static int x = 10;
    int y = 30;

    public void show(){
        System.out.println("Static variable x value = "+ x);
        System.out.println("Instance variable y value = "+ y);
    }

    public static void display(){
        System.out.println("\nStatic variable x value in Static method = "+ x);
    }
}


public class Main {
    public static void main(String[] args) {

        Test t1= new Test();
        t1.x = 55; // changing value of static variable
        t1.y = 100; // changing value of instance variable
        t1.show();
        t1.display(); //Static member 'Test.display()' accessed via instance reference
        Test.display(); // Static member 'Test.display()' accessed directly using Test class name

        System.out.println();

        Test t2= new Test();
        t2.show();
        Test.display();

    }
}