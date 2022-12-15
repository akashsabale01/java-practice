public class Main {

    // For Differentiating method with same name we use following approaches
    // 1. change data types of parameters
    // 2. change no of parameters passed

    // Note-> Return type not differentiate method with same name
    public static int getMax(int m , int n){
        return  m>n? m:n;
    }

    public static float getMax(float m , float n){
        return  m>n? m:n;
    }

    public static int getMax(int m , int n, int p){
        return  (m>=n && m>=p)? m:(n>p? n:p);
    }

    public static void main(String[] args) {

        int num1=25, num2=15, num3=35;
        float num4= 22.44f, num5= 11.81f;

        System.out.println(getMax(num1, num2));
        System.out.println(getMax(num4, num5));
        System.out.println(getMax(num1, num2, num3));
    }
}