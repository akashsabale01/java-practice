import java.util.Arrays;

public class Main {

    // Linear Search
    public static boolean isKeyPresent(int[] arr, int key){

        for(int ele: arr){
            if(ele == key)
                return true;
        }
        return false;
    }

    public static boolean BinarySearchRecursive(int[] arr, int key, int low, int high){
        if( low > high)
            return false;

        int mid = (low + high) / 2;

        if(key == arr[mid])
            return true;
        else if (key < arr[mid])
            return BinarySearchRecursive(arr, key, low, mid-1);
        else
            return BinarySearchRecursive(arr, key, mid + 1, high);
    }

    public static boolean isKeyPresentUsingBinarySearchRecursive(int[] arr, int key){
        int low=0, high= arr.length-1;
        return BinarySearchRecursive(arr, key, low, high);
    }
    public static boolean isKeyPresentUsingBinarySearchIterative(int[] arr, int key){
        int low=0, high= arr.length - 1;

        while ( low <= high){
            int mid = (low + high) / 2;

            if(key == arr[mid])
                return true;
            else if (key < arr[mid]) {
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return false; // Not Found
    }

    public static void main(String[] args) {

//        int[] arr= {20,2,3,5,6,7,90};
//        int key = 70;
//
//        System.out.println(isKeyPresent(arr, key));

        // Input For Binary Search
        int[] arr2= {20,2,3,5,6,7,90};
        Arrays.sort(arr2);
        int key2 = 90, key3= 222;

        System.out.println(isKeyPresentUsingBinarySearchIterative(arr2, key2));
        System.out.println(isKeyPresentUsingBinarySearchIterative(arr2, key3));

        System.out.println(isKeyPresentUsingBinarySearchRecursive(arr2, key2));
        System.out.println(isKeyPresentUsingBinarySearchRecursive(arr2, key3));

//        System.out.println("arr2 = ");
//        for(int ele: arr2)
//            System.out.print(ele + " ");
//        System.out.println();

    }
}