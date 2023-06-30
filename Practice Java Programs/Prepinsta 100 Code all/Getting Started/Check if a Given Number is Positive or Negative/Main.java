import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int num;

        System.out.print("Enter number = ");
        num = scn.nextInt();

        String result = checkPosNeg(num);

        System.out.println("Number is " + result);
    }

    static String checkPosNeg(int number){
        if(number > 0)
            return "Positive";
        else if(number < 0)
            return "Negative";
        else
            return "Zero";
    }
}