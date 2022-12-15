import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        // Find area of triangle
        // here base,height are given

        float base,height,triangleArea;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter base and height = ");
        base = scn.nextFloat();
        height = scn.nextFloat();

        triangleArea = (base*height)/2;
        System.out.println("Triangle Area = " + triangleArea);

        // Find area of triangle
        // here all sides are given

        int a,b,c;
        float s;
        double triangleAreaBySides;

        System.out.println("Enter a and b and c = ");
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();

        s = (a+b+c)/2f; // make 2 as float else it will give int division
        triangleAreaBySides = Math.sqrt(s*(s-a)*(s-b)*(s-c)); // math returns double datatype
        System.out.println("Triangle Area = " + triangleAreaBySides);





    }
}