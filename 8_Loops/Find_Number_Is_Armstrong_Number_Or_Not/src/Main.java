import java.lang.Math;

public class Main {

    public static boolean isArmstrongNumFor3Digits(int num){
        int tempNum = num, sumOfCubesOfNum = 0;

        while(tempNum > 0){
            int rem = tempNum % 10;
            sumOfCubesOfNum += rem * rem * rem;
            tempNum /= 10;
        }
        return num == sumOfCubesOfNum;
    }

    public static int getNoDigits(int num){
        int digitCount=0;
        while(num > 0){
            digitCount++;
            num /= 10;
        }
        return digitCount;
    }

    public static boolean isArmstrongNum(int num){
        int tempNum = num, sum = 0;

        int noOfDigits = getNoDigits(num);

        while(tempNum > 0){
            int rem = tempNum % 10;
            //calculates the power of a number up to digit times and add the resultant to the sum variable
            sum += Math.pow(rem, noOfDigits);
            tempNum /= 10;
        }
        return num == sum;
    }



    public static void main(String[] args) {

//  An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
        int num1 = 153;
        int num2 = 121;

        System.out.println(isArmstrongNumFor3Digits(num1));
        System.out.println(isArmstrongNumFor3Digits(num2));

        System.out.println(isArmstrongNum(num1));
        System.out.println(isArmstrongNum(num2));
    }
}