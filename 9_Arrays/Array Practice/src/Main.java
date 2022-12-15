import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void printArr(int[] arr){
        System.out.print("arr = ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Note - For loop are only for reading array, we can't modify array values using for each loop
    public static void printArrUsingForEachLoop(int[] arr){
        System.out.print("arr = ");
        for (int j : arr) {
            System.out.print(j + " ");
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

        // 1st way of Array Creation - Declaration & Initialization separately

        int[] arr = new int[10]; // Declaring

        for(int i=0; i<arr.length; i++) // Initializing
        {
            arr[i] = i+10;
        }

        // 2nd way of Array Creation - Declaration & Initialization combined
        int[] arr2 = {2,3,4,6,10};

        printArr(arr);
        printArr(arr2);

        printArrUsingForEachLoop(arr);

        Arrays.sort(arr2);

        printArrUsingForEachLoop(arr2);










    }
}