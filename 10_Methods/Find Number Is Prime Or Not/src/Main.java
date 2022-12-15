public class Main {

    // 1st Approach - Iterate till n/2 & check for each number can fully divide given number
    public static boolean isPrime(int num){

        if(num <= 1)
            return false;

        for(int i=2; i<=(num/2); i++){
            if(num%i == 0)
                return false;
        }

        return true;
    }
    // 2nd Approach - 2 is only even prime number so iterate only odd numbers & only one time check if number is even or not
    public static boolean isPrimeOptimized(int num){

        if((num <= 1) || (num % 2 == 0))
            return false;

        for(int i=3; i<=(num/2); i+=2){
            if(num%i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int num1= 12, num2= 13, num3= 91;

        System.out.println(isPrime(num1));
        System.out.println(isPrime(num2));
        System.out.println(isPrime(num3));

        System.out.println();

        System.out.println(isPrimeOptimized(num1));
        System.out.println(isPrimeOptimized(num2));
        System.out.println(isPrimeOptimized(num3));
    }
}