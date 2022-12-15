public class Main {

    public static void displayInWords(int num){
        String numStr = "";

        while (num > 0){
            int rem = num % 10;
            num /= 10;
            numStr += rem;
        }

        for(int i=numStr.length()-1; i>=0; i--){
            char ch = numStr.charAt(i);

            switch (ch){
                case '0' -> System.out.print("Zero ");
                case '1' -> System.out.print("One ");
                case '2' -> System.out.print("Two ");
                case '3' -> System.out.print("Three ");
                case '4' -> System.out.print("Four ");
                case '5' -> System.out.print("Five ");
                case '6' -> System.out.print("Six ");
                case '7' -> System.out.print("Seven ");
                case '8' -> System.out.print("Eight ");
                case '9' -> System.out.print("Nine ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int num1 = 234, num2 = 1200;

        System.out.println(num1);
        displayInWords(num1);
        System.out.println(num2);
        displayInWords(num2);
    }
}