package innerclasses;

interface Welcome{
    void greetGuest();
}

class Outer{
    public void display(){
        // Defining Local Inner class - class inside Outer class method
        class Inner{
            public void show(){
                System.out.println("Hello From Local Inner class");
            }
        }
       // new Inner().show(); // Calling using Anonymous object
        Inner innerObj = new Inner();
        innerObj.show();
    }

    public void greet(){
        // Defining Anonymous Inner Class
        Welcome m = new Welcome(){
            @Override
            public void greetGuest() {
                System.out.println("Welcome Guest by Anonymous Inner Class");
            }
        };
        m.greetGuest();

        // Calling method via anonymous object
//        new Welcome(){
//            @Override
//            public void greetGuest() {
//                System.out.println("Welcome Guest by Anonymous Inner Class");
//            }
//        }.greetGuest();
    }
}

class Test{
    static int x = 10;
    int y = 3;

    // Static Inner class can access only static variables/methods
    static class MyTest{
        public void showMe(){
            System.out.println("x = " + x);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Outer outerObj = new Outer();
        outerObj.display();
        outerObj.greet();

        // here we have created object of inner class only no need of creating object of inner class like local inner class
        Test.MyTest t1 = new Test.MyTest();
        t1.showMe();


    }
}