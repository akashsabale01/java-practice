class MyClass {
    static int count;

    static {
        // This code will be executed only once, when the class is loaded
        System.out.println("Initializing MyClass");
        count = 0;
    }

    public MyClass() {
        // Constructor code here
        System.out.println("Constructor Called");
    }

    public void incrementCount() {
        count++;
    }

    public int getCount() {
        return count;
    }
}


public class Main {
    public static void main(String[] args) {

        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        System.out.println("Count : " + MyClass.count);

        obj1.incrementCount();
        System.out.println("Count for obj1: " + obj1.getCount());

        obj2.incrementCount();
        System.out.println("Count for obj2: " + obj2.getCount());
    }
}