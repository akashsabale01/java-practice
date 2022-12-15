public class Main {

    public static void printDigits(int num){
        System.out.print("Digit = ");
        int rem;
        while(num > 0){
            rem = num % 10;
            System.out.print(rem + " ");
            num /= 10;
        }
    }
    public static void main(String[] args) {

       int num = 234;

       printDigits(num);
    }
}