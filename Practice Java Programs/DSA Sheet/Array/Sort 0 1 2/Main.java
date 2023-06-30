// import java.util.Arrays;

class Main {

    static void Swap(int[] arr, int idxOfA, int idxOfB) {
        int temp = arr[idxOfA];
        arr[idxOfA] = arr[idxOfB];
        arr[idxOfB] = temp;
    }

    public static void sort012(int[] arr) {

        // Method 1 - Using 3 pointers

        int n = arr.length;

        int zeroPtr = 0, currPtr = 0, twoPtr = n - 1;

        while (currPtr <= twoPtr) {

            if (arr[currPtr] == 0) {
                Swap(arr, currPtr, zeroPtr);
                currPtr++;
                zeroPtr++;
            }

            else if (arr[currPtr] == 1) {
                currPtr++;
            }

            else if (arr[currPtr] == 2) {
                Swap(arr, currPtr, twoPtr);
                twoPtr--;
            }
        }

        // Method 2 - Using Frequency of 0, 1, 2

        // int n = arr.length;

        // int[] ans = new int[n];

        // int zeroCount=0, oneCount=0, twoCount=0;

        // for(int i=0; i<n; i++){
        // if(arr[i] == 0)
        // zeroCount++;
        // if(arr[i] == 1)
        // oneCount++;
        // if(arr[i] == 2)
        // twoCount++;
        // }

        // int idx = 0;

        // while(zeroCount > 0){
        // ans[idx++] = 0;
        // zeroCount--;
        // }

        // while(oneCount > 0){
        // ans[idx++] = 1;
        // oneCount--;
        // }

        // while(twoCount > 0){
        // ans[idx++] = 2;
        // twoCount--;
        // }

        // for(int i=0; i<n; i++){
        // arr[i] = ans[i];
        // }

        // Method 3 - Brute Force

        // int n = arr.length;

        // int[] ans = new int[n];

        // int idx = 0;

        // for(int i=0; i<n; i++){
        // if(arr[i] == 0)
        // ans[idx++] = arr[i];
        // }

        // for(int i=0; i<n; i++){
        // if(arr[i] == 1)
        // ans[idx++] = arr[i];
        // }

        // for(int i=0; i<n; i++){
        // if(arr[i] == 2)
        // ans[idx++] = arr[i];
        // }

        // for(int i=0; i<n; i++){
        // arr[i] = ans[i];
        // }

        // Method 0 - Use Default Sorting given in java

        // Arrays.sort(arr);

    }

    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 2, 1, 0 };

        sort012(arr);

        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();

    }
}