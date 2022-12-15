public class Main {
    // 1st Way - This Reverse method works for 234 but not for num with tailing zeros like 1700

//    public static int getReverseOfNum1(int num){
//        int revNum = 0;
//
//        while (num > 0){
//            int rem = num % 10;
//            revNum = revNum *10 + rem;
//            num /= 10;
//        }
//
//        return revNum;
//    }

    // 2nd Way - This Reverse method works for Both num without or with tailing zeros like 1700
    // Using String
    public static String getReverseOfNum(int num){
        String numStr = "";

        while (num > 0){
            int rem = num % 10;
            num /= 10;
            numStr += rem;
        }
        return numStr;
    }

    public static boolean isPalindrome(int num){

        return String.valueOf(num).equals(getReverseOfNum(num));
    }

    public static void main(String[] args) {

        int num1 = 123, num2= 121;

        System.out.println(isPalindrome(num1));
        System.out.println(isPalindrome(num2));

//        System.out.println(getReverseOfNum(1700)); // it gives 71 not 0071
    }
}