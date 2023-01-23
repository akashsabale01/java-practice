import java.util.Arrays;

public class Main {

    static int binarySearch(int[] arr, int target){
        int start =0, end= arr.length-1;

        while(start <= end){
            /*
            * int mid = (start + end ) / 2
            * Here, (start + end) may exceed capacity of integer
            *
            * So, use following formula
            *   mid = start + ((end - start)/ 2);
            * */

            int mid = start + ((end - start) / 2);

            if(target == arr[mid])
                return mid;
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else
                end = mid -1;
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 1;

        System.out.println(Arrays.toString(arr));

        System.out.println(target + " is present at index "+binarySearch(arr, target));
    }
}