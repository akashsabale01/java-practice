import java.util.Scanner;

public class Main {

    public static boolean isEven(int num){
        return (num % 2 == 0);
    }
    public static void main(String[] args) {

        int num1 = 34, num2 = 1;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num3 = ");
        int num3 = scn.nextInt();

        System.out.println(isEven(num1));
        System.out.println(isEven(num2));
        System.out.println(isEven(num3));
    }
}