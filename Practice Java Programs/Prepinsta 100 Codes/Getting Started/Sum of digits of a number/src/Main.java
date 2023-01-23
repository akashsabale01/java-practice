public class Main {

    static int getSumOfDigits(int num){
        if(num == 0)    return 0;

        int digitSum=0, temp = num;

        while (temp != 0){
            int remainder = temp % 10;
            digitSum += remainder;
            temp /= 10;
        }
        return digitSum;
    }

    static int getSumOfDigitsByUsingString(int num){

        String number = String.valueOf(num);

        if(num == 0)    return 0;

        int digitSum=0;

        for(int i=0; i<number.length(); i++){
            digitSum += number.charAt(i) - '0'; // ASCII of 0 is 48
        }

        return digitSum;
    }

    public static void main(String[] args) {

        int num= 2022;

        System.out.println("Sum of digits = "+ getSumOfDigits(num));

        System.out.println("Sum of digits = "+ getSumOfDigitsByUsingString(num));


    }
}