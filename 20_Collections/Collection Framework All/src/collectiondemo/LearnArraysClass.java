package collectiondemo;

import java.util.Arrays;

public class LearnArraysClass {

    public static void main(String[] args) {
        /*
         - It operate on primitive array
         - This class contains various methods for manipulating arrays (such as sorting and searching).
         */

        int[] arr = {100,2,1,45,12,56,19};
        printArr(arr);
        Arrays.sort(arr);
        printArr(arr);

        int presentAtIndex = Arrays.binarySearch(arr, 45);
        System.out.println("45 present at index = " + presentAtIndex);

        int[] arr2 = new int[10];

        Arrays.fill(arr2, 100);

        printArr(arr2);

    }
    static void printArr(int[] arr){
        System.out.print("Array = ");

        for(int ele: arr){
            System.out.print(ele + " ");
        }

        System.out.println();
    }
}
