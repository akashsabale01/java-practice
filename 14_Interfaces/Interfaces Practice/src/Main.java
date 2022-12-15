
interface Test{
    // By default, all methods in Interface are Abstract & public methods
    void meth1();
    void meth2();
}

class MyTest implements Test{

    @Override
    public void meth1() {
        System.out.println("meth1() method called in MyTest class");
    }

    @Override
    public void meth2() {
        System.out.println("meth2() method called in MyTest class");
    }

    public void meth3() {
        System.out.println("meth3() method called in MyTest class");
    }
}

public class Main {
    public static void main(String[] args) {

        Test obj = new MyTest();
        obj.meth1();
        obj.meth2();
//        obj.meth3(); // Cannot be called as Base pointer can't access Derived class methods which are not present in Base Class

        MyTest obj2= new MyTest();
        obj2.meth1();
        obj2.meth2();
        obj2.meth3();

    }
}