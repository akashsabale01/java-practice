public class Main {

    public static boolean isBinary(int num){
        // Convert int to string
//        String numBinary = num + ""; // 1st way
        String numInString = String.valueOf(num); // 2nd way
//        System.out.println(numBinary);

        return numInString.matches("[01]+");
    }

    public static void main(String[] args) {

        int num = 10101010, num2=10123400, num3=7;

        System.out.println(isBinary(num));
        System.out.println(isBinary(num2));
        System.out.println(isBinary(num3));



    }
}