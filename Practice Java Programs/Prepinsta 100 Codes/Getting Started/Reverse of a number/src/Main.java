public class Main {

    static int getReverseOfNum(int num){
        if(num == 0)    return 0;

        int reverseNum=0, temp = num;

        while (temp != 0){
            int remainder = temp % 10;
            reverseNum = reverseNum*10 + remainder;
            temp /= 10;
        }
        return reverseNum;
    }

    static int getReverseOfNumByUsingString(int num){

        if(num == 0)    return 0;

        // Reverse String
        String number = String.valueOf(num);
        char[] tempCharArr = number.toCharArray();

        for(int i=0,j=tempCharArr.length-1; i<j; i++,j--)
        {
            char temp = tempCharArr[i];
            tempCharArr[i] = tempCharArr[j];
            tempCharArr[j] = temp;
        }

        String resultStr = String.valueOf(tempCharArr);
        System.out.println(resultStr); // 0101

        int reverseNum = Integer.parseInt(resultStr); // 101

        return reverseNum;
    }

    public static void main(String[] args) {

        int num= 1010;

        System.out.println("Reverse of number = "+ getReverseOfNum(num));

        System.out.println("Reverse of number = "+ getReverseOfNumByUsingString(num));


    }
}