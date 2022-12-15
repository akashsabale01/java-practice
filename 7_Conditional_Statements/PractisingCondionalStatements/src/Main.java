public class Main {

    public static void greatestAmong3(int a, int b, int c){
        if(a >= b && a >= c){
            System.out.println("a is greatest number ");
        } else if (b >= c) {
            System.out.println("b is greatest number");
        } else{
            System.out.println("c is greatest number");
        }
    }

    public static boolean isPositive(int num){
        return num >= 0;
    }

    public static void main(String[] args) {


        int a=4, b=13, c=2;
        greatestAmong3(a,b,c);

        int d= -4, e= 0;
        System.out.println(isPositive(a));
        System.out.println(isPositive(d));
        System.out.println(isPositive(e));


    }
}