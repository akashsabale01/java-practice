public class Main {
    public  static void printRadixOfNumber(String number){

        if(number.matches("[01]+"))
            System.out.println("Radix of number = 2");
        else if(number.matches("[0-7]+"))
            System.out.println("Radix of number = 8");
        else if(number.matches("[0-9A-F]+"))
            System.out.println("Radix of number = 16");
        else if(number.matches("[0-9]+"))
            System.out.println("Radix of number = 10");
        else
            System.out.println("Invalid Number");


    }
    public static void main(String[] args) {

        String binaryNum = "1010101", octalNum="0123567", hexadecimalNum="23AF", decimalNum= "3299435";

        printRadixOfNumber(binaryNum);
        printRadixOfNumber(octalNum);
        printRadixOfNumber(hexadecimalNum);
        printRadixOfNumber(decimalNum);

    }
}