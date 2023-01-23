import java.util.Arrays;

public class Main {

    // return greatest number <= target
    static int floorOfNumber(int[] arr, int target){

        int start =0, end= arr.length-1;

        //floor doesn’t exist, output is -1.
        if(target < arr[start]) {
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

        return arr[end];// if not element not found then return its previous element
        // before breaking loop => start ans end ... here ans lies between start & end
        // after breaking loop=>    end ans start ... here start= end + 1


    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,8,9,10};
        int target = 33;

        System.out.println(Arrays.toString(arr));

        System.out.println("Floor of " + target + " is " + floorOfNumber(arr, target));
    }
}