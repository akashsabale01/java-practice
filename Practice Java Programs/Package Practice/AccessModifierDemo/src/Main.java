import com.accessDemo.mypack1.Demo1;

public class Main {
    public static void main(String[] args) {
        // Non-Subclass in Different package
        // only public variables/methods accessible
        Demo1 d1 = new Demo1();

        d1.displaySum();
//        System.out.println(d1.a + d1.b + d1.c + d1.d);

    }
}