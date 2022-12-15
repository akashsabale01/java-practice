
class Test{
    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}

public class Main {

    public static void main(String[] args) {

        // first it will execute all Static Blocks sequentially then it will execute main method
        Test t1 = new Test();

        System.out.println("Main");
    }

}