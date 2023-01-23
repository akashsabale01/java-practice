import java.util.Arrays;

public class Main {

    // return smallest number >= target
    static int ceilOfNumber(int[] arr, int target){

        int start =0, end= arr.length-1;

        // if target > the greatest Number in array
        // if start is index out of bound , i.e. element > target Not exits
        if(target > arr[end]) {
            return -1;
        }

        while(start <= end){
            int mid = start + ((end - start) / 2);

            if(target == arr[mid])
                return arr[mid];
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else
                end = mid -1;
        }

        return arr[start]; // Target not found But start <= arr.length-1 i.e. element > target exits


    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,8,9,10};
        int target = 7;
        // ceil of 7 is Smallest number which is >= target, here it is 8

        System.out.println(Arrays.toString(arr));

        System.out.println("Ceil of " + target + " is " + ceilOfNumber(arr, target));
    }
}