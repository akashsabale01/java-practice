import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    static void divide() throws Exception{

        // try with resources automatically closes file & Scanner obj, does not require finally block to release used resources

        try(FileInputStream fi = new FileInputStream("E:\\0_Coding_Project_and_Learning_Stuff\\Java_Tutorials\\Java By Abdul Bari\\18_Exception_Handling\\Try With Resources\\src\\sample.txt"); Scanner scn = new Scanner(fi)){
            int a= scn.nextInt();
            int b= scn.nextInt();
            int c= scn.nextInt();

            int div1 = a / b;
            System.out.println(a+ " / " + b + " = "+ div1);

            int div2 = a / c;
            System.out.println(a+ " / " + b + " = "+ div2);
        }
    }

    public static void main(String[] args) {
        try {
            divide();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}