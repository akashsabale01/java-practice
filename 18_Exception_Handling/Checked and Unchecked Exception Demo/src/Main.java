import java.io.*;

class LowBalanceException extends Exception{
    public String toString(){
        return "Balance should not be less than 2000, Enter Amount to withdraw such that after withdrawal Balance >= 2000 ";
    }
}

public class Main {

    static void meth3(){

        // Example of Unchecked Exception --- here Arithmetic exception
//        int a= 100, b= 0, c;
//        try{
//            c = a / b;
//            System.out.println("Division = " + c);
//        }
//        catch (Exception e){
////            System.out.println(e.getMessage());
//            System.out.println(e);
////            e.printStackTrace(); // it briefly prints (i.e. trace) where exception occurred
//
//        }

        // Example of checked Exception
//        try{
//            FileInputStream fi = new FileInputStream("My.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }

        // Example of Custom Exception -- we require to define class for Custom Exception
        int balance= 5000, withdrawAmount = 4000;

        try {
            int amountRemainingAfterWithdraw = balance - withdrawAmount;

            if(!(amountRemainingAfterWithdraw >= 2000)) // if min balance not maintained then raise exception
                throw new LowBalanceException();

            balance -= withdrawAmount;
            System.out.println("Withdraw successful, Updated Balance = "+ balance);
        }
        catch (LowBalanceException e){
            System.out.println(e);
        }

    }

    static void meth2(){
        meth3();
    }
    static void meth1(){
        meth2();
    }

    public static void main(String[] args) {

        meth1();
    }
}