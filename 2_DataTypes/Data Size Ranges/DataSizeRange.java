import java.lang.*;

class DataSizeRange{

    public static void main(String[] args){

        // Command for getting info related to particular class
        // javap java.lang.Integer 

        System.out.println("Int Min: " + Integer.MIN_VALUE);
        System.out.println("Int Max: " + Integer.MAX_VALUE);
        System.out.println("Int Bytes: " + Integer.BYTES);

        System.out.println("Float Min: " + Float.MIN_VALUE);
        System.out.println("Float Max: " + Float.MAX_VALUE);
        System.out.println("Float Bytes: " + Float.BYTES);

        System.out.println("Double Min: " + Double.MIN_VALUE);
        System.out.println("Double Max: " + Double.MAX_VALUE);
        System.out.println("Double Bytes: " + Double.BYTES);

        // All other can be done as above
        // But Boolean doesn't have min/max value, also don't have Bytes 
        // i.e. Boolean doesn't have fix size

    }
}