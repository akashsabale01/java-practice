public class Main {

//    static String isEvenOrOdd(int num){
//       return (num % 2 == 0)? "Even":"Odd";
//    }

    static String isEvenOrOdd(int num){
        String status = ((num&1) == 0 )? "Even":"Odd";
        return (num + " is " + status);
    }

    public static void main(String[] args) {

        int num1 = 22, num2 = 11;

        System.out.println(isEvenOrOdd(num1));
        System.out.println(isEvenOrOdd(num2));
    }
}