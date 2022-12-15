public class Main {

    public static boolean isHexadecimal(int num){
        // Convert int to string
//        String numBinary = num + ""; // 1st way
        String numInString = String.valueOf(num); // 2nd way
//        System.out.println(numBinary);

        return numInString.matches("[A-F0-9]+");
    }

    public static boolean isHexadecimal(String num){
        return num.matches("[A-F0-9]+");
    }

    public static void main(String[] args) {

        int num = 0x234B;
        System.out.println(isHexadecimal(num));

        String num2 = "0x324FGH";
        System.out.println(isHexadecimal(num2));
    }
}