public class Main {
    public static void main(String[] args) {

        int a = 20, b = 40;

        System.out.println("Before Swapping");
        System.out.println(a + " "+ b);

        swap(a,b);

        System.out.println("After Swapping");
        System.out.println(a + " "+ b);
    }

    static void swap(int x , int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}