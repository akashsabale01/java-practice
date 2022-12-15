import java.util.Scanner;

class Main{

    public static void cummulativeSumArray(int[] arr){

        int[] result = new int[arr.length];

        int cummulativeSum = 0;

        for(int i=0; i<arr.length; i++){
            result[i] = arr[i] + cummulativeSum;
            cummulativeSum += arr[i];
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = result[i];
        }
    }

    public static void printArr(int[] arr){
        System.out.println("Array: ");
        for(int ele: arr)
            System.out.println(ele);
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int arrSize;

        System.out.println("Enter number of elements");
        arrSize = scn.nextInt();

        if(arrSize <= 0){
            System.out.println("Invalid Range");
            System.exit(0); // stop program
        }

        int[] arr = new int[arrSize];

        System.out.println("Enter the elements");
        for(int i=0; i<arrSize; i++)
            arr[i] = scn.nextInt();

        printArr(arr);

        cummulativeSumArray(arr);

        printArr(arr);


    }
}