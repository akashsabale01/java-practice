
    class Base{
        public void display(){
            System.out.println("Base Class Display() Method Called");
        }
    }

    class Derived extends Base{
        @Override
        public void display(){
            System.out.println("Child Class Display() Method Called");
        }
    }

    public class Main {
        public static void main(String[] args) {

            Base baseObj = new Base();
            baseObj.display();

            Derived derivedObj = new Derived();
            derivedObj.display();

            // Here Display() of Base class is overrided in Derived Class
        }
    }