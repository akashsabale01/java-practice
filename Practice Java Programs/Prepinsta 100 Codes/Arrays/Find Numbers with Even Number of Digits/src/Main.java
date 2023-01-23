public class Main {

    static int noOfDigitsUsingModulo(int num){

        if(num < 0){
            num = num * -1; // make -ve as +ve
        }

        // no of digits is 1 as 0 is written in single digits, So its odd no of digits
        if(num == 0)
            return 1;

        int noOfDigits = 0;

        while(num != 0){
            noOfDigits++;
            num /= 10;
        }

        return noOfDigits;
    }

    // 2nd way to Find no of digits
    // TC = O(n)
    static int noOfDigitsUsingString(int num){
        if(num < 0) num *= -1;

        return String.valueOf(num).length() ;
    }

    //  3rd way to Find no of digits
    // TC = O(1)
    static int noOfDigitsUsingLog10(int num){
        if(num < 0) num *= -1;

        return (int)Math.log10(num) + 1;
    }

    static int findEvenNumbers(int[] nums) {

        if(nums.length == 0)    return 0;

        int evenNumCount = 0;

        for(int ele: nums){
            if((noOfDigitsUsingModulo(ele) % 2) == 0) evenNumCount++;
//            if((noOfDigitsUsingString(ele)) % 2) == 0) evenNumCount++;
//            if((noOfDigitsUsingLog10(ele) % 2) == 0) evenNumCount++;
        }

        return evenNumCount;
    }

    public static void main(String[] args) {

        int[] arr={-12,345,2,6,7896};

        System.out.println(findEvenNumbers(arr));
    }
}