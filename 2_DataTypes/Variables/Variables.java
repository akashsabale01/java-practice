import java.lang.*;

class Variables{

    public static void main(String[] args){

        // byte a; // This will gives error, So Variable must be initialized
        // byte a = 128; // it gives error as 128 is out of range of byte data type
        byte a = 127;
        System.out.println(a);

        short b = 2342;
        System.out.println(b);

        int c = 32224;
        System.out.println(c);

        long d = 23422919;
        System.out.println(d);

        float e = 32.11f; // It should have f at the end to show it is float value
        System.out.println(e);

        double f = 4222.43;
        System.out.println(f);

        char g = 'z';
        System.out.println(g);

        boolean isValid = true;
        System.out.println(isValid);
        

    }
}