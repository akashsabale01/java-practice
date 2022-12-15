import java.util.*;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        double r1, r2;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a, b, c = ");
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();

        int d = (b*b) - (4 * a * c);

        r1 = (-b + Math.sqrt(d)) / (2 * a);
        System.out.println("Root 1 = " + r1);

        r2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("Root 2 = " + r2);
    }
}