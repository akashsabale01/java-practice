import java.lang.*;

class DataTypeDetails{

    public static void main(String[] args){

        int num1 = 5;
        System.out.println(Integer.toBinaryString(num1));

        int num2 = -5;
        System.out.println(Integer.toBinaryString(num2));

        /*
            sign bit shows sign of number = 0->positive num or 1->negative num 
            sign bit is most significant bit(MSB) i.e. left side bit

            -ve number is stored in 2's complement form
            2's complement form = 1'st complement of given(i.e. invert bit) + 1
         */
    }
}