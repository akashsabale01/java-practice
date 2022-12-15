//import java.util.*;

public class Main {

    public static void swapVar(){
        int temp = a;
        a = b;
        b = temp;
    }

    static int a = 3; // it is class level global
    static int b= 7; // it is class level global

    public static void main(String[] args) {

        /*
        *   There is no pointers & references in java,
        *   So we cannot directly swap value of a, b by passing address of a and b
        *
        *   So For Solving this problem, We make a, b as global variable
        * */

//        System.out.println("a= " + a + " "+ "b = " + b);
//        swapVar();
//        System.out.println("a= " + a + " "+ "b = " + b);

        boolean isValid = true; // takes 1 byte
        System.out.println(isValid);

        byte a = 10; // takes 1 byte
        short sh = 1000; // takes 2 byte
        int num = 342; // takes 4 byte
        long bigNum = 100000L; // takes 8 byte
        float pi = 3.145355F; // takes 4 byte
        double d1 = 882.335; // takes 8 byte

        char ch = 'a'; // it takes 2 bytes
        /*
          Why char uses 2 byte in java and what is \u0000 ?
          It is because java uses Unicode system not ASCII code system.
          The \u0000 is the lowest range of Unicode system.
        */



    }
}