import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int num;

        System.out.print("Enter N = ");
        num = scn.nextInt();

        int result = sumOfDigitOfNumber(num);

        System.out.println(result);
    }

    static int sumOfDigitOfNumber(int num){
        int sum = 0;

        while(num != 0){
            int rem = num % 10 ;
            sum  += rem;
            num /= 10;
        }

        return sum;
    }
}