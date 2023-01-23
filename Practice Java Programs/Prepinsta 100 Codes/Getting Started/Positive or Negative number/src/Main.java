public class Main {

    static void printPosOrNeg(int number){
        if(number == 0)
            System.out.println(number + " is Zero");
        else if(number > 0)
        System.out.println(number + " is Positive Number");
        else
            System.out.println(number + " is Negative Number");

    }

    public static void main(String[] args) {

        int num1 = 20, num2 = -3, num3 = 0;

        printPosOrNeg(num1);
        printPosOrNeg(num2);
        printPosOrNeg(num3);
    }
}