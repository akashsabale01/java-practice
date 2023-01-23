public class Main {

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0)
            return -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i; // target found at index i
            }
        }

        return Integer.MAX_VALUE; // target not found
        // Here instead of -1, we return Integer.MAX_VALUE because -1 may be target value
    }

    static boolean linearSearch1(int[] arr, int target){
        if(arr.length == 0)
            return false;

        for (int j : arr) {
            if (j == target) {
                return true; // target found
            }
        }

        return false; // target not found
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int target = 4;

        System.out.println(linearSearch(arr, target));
        System.out.println(linearSearch1(arr, target));

    }
}