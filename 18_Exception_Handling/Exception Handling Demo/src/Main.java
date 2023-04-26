import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Simple try catch block

//        int a, b, c;
//
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter two Numbers = ");
//        a = scn.nextInt();
//        b = scn.nextInt();
//
//        try {
//            c = a / b;
//            System.out.println("Division: " + a + " / " + b + " = " + c);
//            System.out.println("Program runs without exception");
//        } catch (ArithmeticException e) {
//            System.out.println("Division by Zero not allowed, " + e);
//            System.out.println("Program runs with exception, where exception is " + e);
//        }
//
//        System.out.println("Bye");

        // Simple try catch block vs Nested try catch block

        int[] arr = {100, 20, 10, 0, 5};

        // Simple try catch block
//        try {
//
//            int division = arr[0] / arr[1];
//            System.out.println("Division: " + division);
//            System.out.println(arr[5]);
//        } catch (ArithmeticException e) {
//            System.out.println("Denominator should not be 0, " + e);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Index is Invalid, " + e);
//        }

        // Nested try catch block
        try {
            try {
                int division = arr[0] / arr[1];
                System.out.println("Division: " + division);
            } catch (ArithmeticException e) {
                System.out.println("Denominator should not be 0, " + e);
            }

            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is Invalid, " + e);
        }
        
        System.out.println("Bye");


    }
}