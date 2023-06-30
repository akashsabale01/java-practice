import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int num;

        System.out.print("Enter number = ");
        num = scn.nextInt();

        boolean result = isEven(num);

        String output = (result == true)? "Even":"Odd";

        System.out.println(output);
    }

    static boolean isEven(int num){
        return (num % 2 == 0);
    }
}