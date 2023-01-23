import java.util.Scanner;

public class Main {

    static boolean isAlphabet(char ch){

//        return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z');

        return Character.isAlphabetic(ch);
    }

    public static void main(String[] args) {

        char ch1 = 'a', ch2= '7', ch3='A', ch4='!';

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch5 = scn.next().trim().charAt(0);

        System.out.println(isAlphabet(ch1));
        System.out.println(isAlphabet(ch2));
        System.out.println(isAlphabet(ch3));
        System.out.println(isAlphabet(ch4));
        System.out.println(isAlphabet(ch5));
    }
}