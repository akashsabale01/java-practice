public class Main {

    public static int getNoDigits(int num){
        int digitCount=0;
        while(num > 0){
            digitCount++;
            num /= 10;
        }
        return digitCount;
    }
    public static void main(String[] args) {

        int num = 234;

        System.out.println(getNoDigits(num));
    }
}