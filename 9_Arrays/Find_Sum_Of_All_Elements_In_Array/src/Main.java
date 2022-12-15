public class Main {
    public static void printArr(int[] arr){
        System.out.print("arr = ");
            for(int i=0; i<arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
            System.out.println();
        }

    public static int getSum(int[] arr){
        int sum = 0;

        for(int i=0; i<arr.length; i++)
            sum += arr[i];

        return sum;
    }



    public static void main(String[] args) {

        // 1st way of Array Creation

        // Declaring
        int[] arr = new int[10];

        // Initializing
        for(int i=0; i<arr.length; i++){
            arr[i] = i+10;
        }

        // 2nd way of Array Creation

        int[] arr2 = {2,3,4,6,10};


        printArr(arr);
        System.out.println("Sum = " + getSum(arr));

        printArr(arr2);
        System.out.println("Sum = " + getSum(arr2));









    }
}