import java.util.Scanner;

public class Main {

//    static void printGreatestAmong3(int num1, int num2, int num3 ){
//
//        if(num1>= num2 && num1>=num3)
//            System.out.println(num1 + " is Greatest");
//        else if(num2>= num1 && num2>=num3)
//            System.out.println(num2 + " is Greatest");
//        else
//            System.out.println(num3 + " is Greatest");
//    }

    static void printGreatestAmong3(int num1, int num2, int num3 ){

        int greatest = Math.max(num3, Math.max(num1, num2));

        System.out.println(greatest + " is Greatest Number among 3 numbers");

    }

//    static void printGreatestAmong3(int num1, int num2, int num3 ){
//
//        int greatest = num1;
//
//        if(num2 > greatest)
//            greatest = num2;
//
//        if(num3 > greatest)
//            greatest = num3;
//
//        System.out.println(greatest + " is Greatest Number among 3 numbers");
//
//    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Enter 3 numbers: ");
        num1 = scn.nextInt();
        num2 = scn.nextInt();
        num3 = scn.nextInt();

        printGreatestAmong3(num1, num2, num3);
    }
}