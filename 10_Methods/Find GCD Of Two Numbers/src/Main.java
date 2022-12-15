public class Main {

    public static int getGCD(int m, int n){
        if(m == n)
            return m;

        while (m != n){
            if(m > n)
                m = m - n;
            else {
                n = n - m;
            }
        }

        return m;
    }

    public static void main(String[] args) {

        int num1=25, num2=15, num3=35, num4=56;
        int num5=31, num6=17; // Check for Prime No
        // GCD of 2 Prime numbers is always 1

        System.out.println(getGCD(num1, num2));
        System.out.println(getGCD(num3, num4));
        System.out.println(getGCD(num5, num6));
    }
}