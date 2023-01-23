import java.util.Arrays;

public class Main {

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start =0, end= arr.length-1;

        // Check Whether Array is in Ascending or in Descending order
        boolean isAscending = (arr[start] <= arr[end]);

        while(start <= end){

            int mid = start + ((end - start) / 2);

            if(target == arr[mid])
                return mid;

            else if(isAscending){
                if (target > arr[mid])
                    start = mid + 1;    // Search in Right
                else
                    end = mid -1;   // Search in Left
            }
            else {
                // here array will be in Descending order
                if (target > arr[mid])
                    end = mid -1; // Search in Left
                else
                    start = mid + 1; // Search in Right
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 ={9,8,7,6,5,4,3,2,1} ;

        int target = 1;

        System.out.println(Arrays.toString(arr1));
        System.out.println(target + " is present at index "+orderAgnosticBinarySearch(arr1, target));

        System.out.println(Arrays.toString(arr2));
        System.out.println(target + " is present at index "+orderAgnosticBinarySearch(arr2, target));
    }
}