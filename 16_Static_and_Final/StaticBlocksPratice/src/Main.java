
class Test {
    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}


public class Main {
//    static {
//        System.out.println("Block 1");
//    }

    public static void main(String[] args) {

//        Set	of	statements	are	written	in	the	form	of	blocks	and	are	made	static.
//        It	is	used	to	initialise	static	data	member.

        Test t = new Test();
        System.out.println("In Main Class!");
    }

//    static {
//        System.out.println("Block 2");
//    }
}