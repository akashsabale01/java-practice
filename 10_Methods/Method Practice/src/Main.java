public class Main {

    static int getMax(int a, int b){
        return (a > b)? a:b;
    }

    int getMin(int a, int b){
        return (a < b)? a:b;
    }

    public static void main(String[] args) {

         int a=20, b=34;

         // Static method only calls other static methods, it doesn't allow accessing non-static method

         // As getMax() is also static Then static method main() can call getMax() method
         int c = getMax(a, b);

         System.out.println("Max = " + c);

         // For Calling Non-Static method getMin() in static method main(), we have to create object of Main Class & by using that object we call getMin() i.e. non-static method

        Main obj = new Main();

        int d = obj.getMin(a, b);
        System.out.println("Min = " + d);

    }
}