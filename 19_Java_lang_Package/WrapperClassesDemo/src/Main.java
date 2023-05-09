public class Main {

    static void printElementsSeperatedBySpace(int ...args){
        for(int num: args)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

     /*
           java.lang.Object
              java.lang.Number
                  java.lang.Integer,

        Wrapper	classes	are	available for every	primitive data types,
        like short,byte,int,float,double,char,boolean

       Java	provides	wrapper	classes	around	primitives
       so	they	can	be	used	as	classes	and	their	objects	can	be	created

     */


        // 1) Integer Wrapper Class **************************

        // Integer b = Integer.valueOf(a); is same as Integer b= a;
        // Here Integer.valueOf() is called automatically

        int a = 10;
        Integer b = Integer.valueOf(a);
        Integer c = a; // Also called as Auto Boxing
        System.out.println(b + " " + c);

        Integer d = Integer.valueOf(300);
        int e = d.intValue();
        int f = d; // Also called as Auto Unboxing
        System.out.println(e + " " + f);

        // int e = d.intValue(); is same as  int e = d;
        // Here .intValue() is called automatically

        // 2) Byte Wrapper Class **************************

        Byte g = 15;
        Byte h = Byte.valueOf("15");
        System.out.println(g + " "+ h);

        byte i = 24;
//        Byte i1 = Byte.valueOf(24); // not allowed int, Cannot resolve method 'valueOf(int)'
        Byte i2 = Byte.valueOf(i);
        System.out.println(i + " "+ i2);

        // 3) Short Wrapper Class **************************

        Short j1 = Short.valueOf("21");
//        Short j2 = Short.valueOf(21); // not allowed int, Cannot resolve method 'valueOf(int)'
        short j3 = 21;
        Short j4 = j3; // same as Short j4 = Short.valueOf(j3)
        System.out.println(j1 +" "+ j3);

        // 4) Float Wrapper Class **************************

        Float k1 = 12.43f; // Append f compulsory
        Float k2 = Float.valueOf("12.43");
//        Float k3 = Float.valueOf(23.22); // gives error it can't take double value
        Float k3 = Float.valueOf(23.22f); // float value must have f appended
        System.out.println( k2 + " " + k3);

        // 5) Double Wrapper Class **************************

        Double l1 = Double.valueOf(224.34);

        // 6) Character Wrapper Class **************************

        Character m1 = Character.valueOf('P');
        System.out.println(m1);

        // 7) Boolean Wrapper Class **************************

        Boolean n1 = Boolean.valueOf(true);
        Boolean n2 = Boolean.valueOf("false");

        // Boxing & Unboxing
        int p2 = 32;
        Integer p3 = Integer.valueOf(p2); // This is Auto Boxing
        int p4 = p3; // Auto Unboxing, it automatically calls .intValue()

        Float p1 = Float.valueOf("22.4f");
        float x = p1.floatValue(); // unboxing
        float y = p1; // This is Auto Unboxing, it automatically calls .floatValue()
        System.out.println( p1 + " " + x +" "+ y);

        // 8) Integer Wrapper Class in Detail ******************

        int t = 15;
        Integer t1 = t;
        Integer t2 = 15;

        System.out.println(t1.equals(t));
        System.out.println(t1.equals(t2));

        // In Integer.valueOf(string, radix), 1st parameter is string i.e. number in string format & 2nd is radix
        Integer t3 = Integer.valueOf("1010", 2); // binary number 1010 = 10 in decimal
        Integer t4 = Integer.valueOf("A7", 16); // Hexadecimal number A7 = 167 in decimal
        Integer t5 = Integer.decode("0xA7");
        Integer t6 = Integer.MIN_VALUE;
        Integer t7 = Integer.MAX_VALUE;
        Integer t8 = Integer.max(33, 66);
        Integer t9 = Integer.parseInt("4345");

        Integer t10 = Integer.reverse(86);
        /*

        The java.lang.Integer.reverse() is an inbuilt method in Java and
        it is used to return the reverse order of the bits in the two’s complement binary representation of the specified int value.

        Input: 86
        Output: 1778384896
        Explanation:
        Consider an integer a = 86
        Binary Representation = 1010110
        The number of one bit = 4
        After reversing it is = 1778384896
        *
        *
        *
        *
        * */

//        System.out.println(t3 + " "+ t4 + " " + t5);
        printElementsSeperatedBySpace(t3,t4,t5,t6,t7,t8,t9,t10);
        System.out.println(Integer.toBinaryString(10));

        // 9) Float Wrapper Class in Detail ******************

        float val1 = 23.45f;
        Float val2 = 23.45f;
        Float val3 = 23.45f / 0; // infinity value, For float division by zero exception not occurred
        Float val4 = (float)Math.sqrt(-1);

        System.out.println(val2.equals(val1));
        System.out.println(val3.isInfinite());
        System.out.println(val3 == Float.NEGATIVE_INFINITY);
        System.out.println(val4.isNaN());

        // Double will have similar methods like float only size is different

        // 10) Character  Wrapper Class in Detail ******************

        Character ch = 'A';

        System.out.println(ch.equals('A'));
        System.out.println(Character.toLowerCase(ch));
        System.out.println(Character.isAlphabetic(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isUpperCase(ch));


        // 11) Boolean  Wrapper Class in Detail ******************

        Boolean bol = true;

        System.out.println(bol.equals(true));
        System.out.println(Boolean.logicalAnd(true, false ));



    }
}