import java.util.Scanner;

public class Main {

    // 1st Way
    static int getSumTillN(int num1, int num2){
        int totalSum = 0;

        if(num1 <0 || num2<0 || num2==0)
            return totalSum;

        for(int i=num1; i<=num2; i++)
            totalSum += i;

        return totalSum;
    }

    // 2nd way - Using Formula
//    static int getSumTillN(int num1, int num2){
//        if(num1 <0 || num2<0 || num2==0)
//            return 0;
//
//        return (num2 * (num2 + 1) / 2) - (num1 * (num1 + 1) / 2) + num1;
//    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter 1st Number = ");
        int number1 = scn.nextInt();

        System.out.println("Enter 2nd Number = ");
        int number2 = scn.nextInt();

        System.out.println("Sum of numbers from "+ number1 + " to " + number2+ " is "+ getSumTillN(number1, number2));
    }
}