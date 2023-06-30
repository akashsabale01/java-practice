import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int num;

        System.out.print("Enter N = ");
        num = scn.nextInt();

        int result = sumOf1stNNumber(num);

        System.out.println(result);
    }

    static int sumOf1stNNumber(int num){
        int sum = 0;

        for(int i=1; i<=num; i++)
            sum += i;

        return sum;
    }
}