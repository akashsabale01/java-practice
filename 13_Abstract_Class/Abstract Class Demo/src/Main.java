abstract class Base{
    public Base(){
        System.out.println("Base Class Constructor called");
    }
    public void display(){
        System.out.println("Base Class Display() Method Called");
    }

    public abstract void show(); // Abstract Method
}

class Derived extends Base{
    public Derived(){
        System.out.println("Derived Class Constructor called");
    }

    @Override
    public void show() {
        System.out.println("Show() method in Derived class");
    }
}



public class Main {
    public static void main(String[] args) {

        // We cannot create object of Abstract Class
        Base obj = new Derived();
        obj.show();
        obj.display();
    }
}