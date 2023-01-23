public class Main {

    static int getOrder(int num){
        int order = 0;

        while (num != 0){
            order++;
            num /= 10;
        }
        return order;
    }
    static boolean isArmstrongNum(int num){
        int order = getOrder(num); // power to each number

        int sumOfEachDigitToOrder = 0, temp = num;

        // loop to extract digit, find ordered power of digits & add to sum
        while (temp != 0){
            int digit = temp % 10;
            sumOfEachDigitToOrder+= (int)Math.pow(digit, order);
            temp /= 10;
        }

        return sumOfEachDigitToOrder == num;
    }
    static void printArmstrongNumbersInRange(int start, int end){
        for(int i=start; i<=end; i++){
            if(isArmstrongNum(i))
                System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {

       int start= 1, end= 1000;

       printArmstrongNumbersInRange(start, end);
    }
}