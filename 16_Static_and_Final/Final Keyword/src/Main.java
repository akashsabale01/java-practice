
class Test{
    final public void show(){
        System.out.println("hello");
    }
}
class MyTest extends Test{

    // Note-> We can't override method if it is final

//    public void show(){
//        System.out.println("test");
//    }
}

final class Demo{
    int x = 20;
}
// We Cannot Extend From Final Class

//class MyDemo extends Demo{
//}


public class Main {

    // 1st way of initializing
    final float PI = 3.1433444f;

    // 2nd way of initializing
    static final float OMEGA;
    static {
        OMEGA = 444.22f;
    }

    // 3rd way of initializing
    final float EPSILON;

    public Main(){
        EPSILON  = 223.3224F;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}