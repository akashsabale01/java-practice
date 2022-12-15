public class Main {

    public static int getFactorial(int n){
        if(n < 0) return -1;

        int fact = 1;
        for(int i=2; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(getFactorial(n));
    }
}