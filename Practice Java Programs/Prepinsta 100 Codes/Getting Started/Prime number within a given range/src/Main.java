import java.util.Scanner;

public class Main {
    // A number n is not a prime, if it can be factored into two factors a & b:
    // n = a * b
    /*
      Now a and b can't be both greater than the square root of n, since
      then the product a * b would be greater than sqrt(n) * sqrt(n) = n.
      So in any factorization of n, at least one of the factors must be
      smaller than the square root of n, and if we can't find any factors
      less than or equal to the square root, n must be a prime.
     */
    static boolean isPrime(int num){
        if(num <= 1)    return false;
        if(num == 2)    return true;
        if(num%2 == 0)  return false;

        for(int i=3; i*i<=num; i+=2){
            if(num % i == 0)
                return false;
        }
        return true; // else it is prime
    }

    static void primeNumInRange(int start, int end){

        for(int i=start; i<=end; i++){
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter start and end = ");
        int a = scn.nextInt();
        int b = scn.nextInt();

        primeNumInRange(a,b);


    }
}