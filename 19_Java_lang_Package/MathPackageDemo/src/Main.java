public class Main {
    public static void main(String[] args) {

        /*

        Java Math class provides several methods to work on math calculations like min(), max(), avg(), sin(), cos(), tan(), round(), ceil(), floor(), abs() etc.

        If the size is int or long and the results overflow the range of value, the methods addExact(), subtractExact(), multiplyExact(), and toIntExact() throw an ArithmeticException.

        For other arithmetic operations like increment, decrement, divide, absolute value, and negation overflow occur only with a specific minimum or maximum value. It should be checked against the maximum and minimum value as appropriate.

        */

        System.out.print("Absolute: ");
        System.out.println(Math.abs(-22));

        System.out.print("Strict Absolute: ");
        System.out.println(StrictMath.abs(-22));

        System.out.print("Square Root: ");
        System.out.println(Math.sqrt(9));

        System.out.print("Cube Root: ");
        System.out.println(Math.cbrt(64));

        System.out.print("Exact Decrement: ");
        System.out.println(Math.decrementExact(7));

//        System.out.print("Exact Decrement of Min Value: ");
//        System.out.println(Math.decrementExact(Integer.MIN_VALUE)); // gives Exception
        int val = Integer.MIN_VALUE;
        val--;
        System.out.println("Simple Decrement of Min Value: "+ val); // gives Integer.MAX_VALUE, does not gives Exception

        System.out.print("Exponent value in floating point representation: ");
        System.out.println(Math.getExponent(125.45));

        System.out.print("Floor Division: ");
        System.out.println(Math.floorDiv(20,3));

        System.out.print("e power x: ");
        System.out.println(Math.exp(1));

        System.out.print("Strict e power x: ");
        System.out.println(StrictMath.exp(1));

        System.out.print("log base 10: ");
        System.out.println(Math.log10(100));

        System.out.print("Maximum : ");
        System.out.println(Math.max(33, 55));

        System.out.print("Minimum: ");
        System.out.println(Math.min(33,55));

        System.out.print("Convert to Radians: ");
        System.out.println(Math.toRadians(90));

        System.out.print("Convert to Degrees: ");
        System.out.println(Math.toDegrees(Math.tanh(1)));

        System.out.print("Convert to Degrees: ");
        System.out.println(StrictMath.toDegrees(StrictMath.tanh(1)));

        // random() gives double value
        // random returns double value greater than or equal to 0.0 and less than 1.0.
        System.out.print("Random (By default gives value between 0.0 to 1.0): ");
        System.out.println(Math.random());

        System.out.print("Random 1 digit number in integer format: ");
        System.out.println((int)(Math.random() * 10));

        System.out.print("Random 2 digit: ");
        System.out.println(Math.random() * 100);

        System.out.print("Random 3 digit: ");
        System.out.println(Math.random() * 1000);

        System.out.print("power: ");
        System.out.println(Math.pow(5,3));

        System.out.print("Exact Multiply: ");
        System.out.println(Math.multiplyExact(100,200)); // gives exception when multiplication results overflow given size

        System.out.print("Round: ");
        System.out.println(Math.round(32.76));

        System.out.print("Ceil: ");
        System.out.println(Math.ceil(32.76));

        System.out.print("Floor: ");
        System.out.println(Math.floor(32.76));


    }
}