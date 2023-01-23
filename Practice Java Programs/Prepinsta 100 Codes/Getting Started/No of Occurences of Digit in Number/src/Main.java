public class Main {

    static int getOccurrenceOfDigit(int number, int digit){
        // 1st way -- Using % operator
//        int noOfOccurrence = 0;
//
//        while(number != 0){
//            int remainder = number % 10;
//            if(remainder == digit){
//                noOfOccurrence++;
//            }
//            number /= 10;
//        }
//        return noOfOccurrence;

        // 2nd way -- using String & char for digit
        int noOfOccurrence = 0;
        String num = String.valueOf(number);
        char digitToMatch = (char)(digit + '0');
        /*
        * If you add '0' with int variable, it will return actual value in the char variable.
        * The ASCII value of '0' is 48. So, if you add 1 with 48, it becomes 49 which is equal to 1.
        * The ASCII character of 49 is 1.
        * */
        System.out.println(num + " " + digitToMatch);

        for(int i=0; i<num.length(); i++){
            char ch = num.charAt(i);
            if(ch == digitToMatch) {
                noOfOccurrence++;
            }
        }
        return noOfOccurrence;
    }

    public static void main(String[] args) {

        int number = 1275737827;
        int digit = 7;

        System.out.println(digit +" is occured "+ getOccurrenceOfDigit(number, digit)+" times");
    }
}