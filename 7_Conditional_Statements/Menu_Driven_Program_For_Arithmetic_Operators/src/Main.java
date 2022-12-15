import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void showMenu(){
        System.out.println("***** MENU ******");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
    }

    public static void showMenu2(){
        System.out.println("***** MENU ******");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
//        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Program for Switch cases on int

//        System.out.print("Enter two integer numbers = ");
//        int a = scn.nextInt();
//        int b = scn.nextInt();
//        System.out.println();
//
//        showMenu();
//
//        System.out.print("Enter your choice = ");
//        int choice = scn.nextInt();
//        System.out.println();
//
//        switch (choice){
//            case 1-> System.out.println("Addition = " + (a+b));
//            case 2-> System.out.println("Subtraction = " + (a-b));
//            case 3-> System.out.println("Multiplication = "+ (a*b));
//            case 4-> System.out.println("Division = "+(a/b));
//            default -> System.out.println("Invalid Choice");
//        }

        // Program for Switch cases on String
        System.out.println("Enter two integer numbers = ");
        int a = scn.nextInt();
        int b = scn.nextInt();

        showMenu2();

        // for storing "enter" which we have pressed after giving integer
        // This clears buffer after taking "enter" as input
        //if you read int before string then this Problem arises
        //Problem is we are not able to take input string because after entering int, nextLine() take "enter" as input
       // Note -> We have to store "enter" when we are taking string input after int input
        scn.nextLine();

        System.out.println("Enter your choice in words:");
        String choice = scn.nextLine();

        choice = choice.toUpperCase();

        switch (choice){
            case "ADD"-> System.out.println("Addition = " + (a+b));
            case "SUB"-> System.out.println("Subtraction = " + (a-b));
            case "MUL"-> System.out.println("Multiplication = "+ (a*b));
            case "DIV"-> System.out.println("Division = "+(a/b));
            default -> System.out.println("Invalid Choice");
        }
    }
}