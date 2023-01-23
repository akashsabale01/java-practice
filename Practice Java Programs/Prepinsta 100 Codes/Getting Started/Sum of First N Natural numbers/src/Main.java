import java.util.Scanner;

public class Main {

    // 1st Way
//    static int getSumTillN(int num){
//        int totalSum = 0;
//
//        if(num <=0)
//            return totalSum;
//
//        for(int i=1; i<=num; i++)
//            totalSum += i;
//
//        return totalSum;
//    }

    // 2nd way - Using Formula
//    static int getSumTillN(int num){
//        if(num <= 0)    return 0;
//
//        return (num* (num+1)) / 2;
//    }

    // 3rd way - Using Recursion
    static int getSumTillN(int num){
        if(num == 0)    return 0;

        return num + getSumTillN(num -1 );
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Number = ");
        int number = scn.nextInt();

        System.out.println("Sum of 1st "+ number + " numbers from 1 is "+ getSumTillN(number));
    }
}