import java.util.*;

class Main {

    static void Reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void rotateKTimes(int[] arr, int K) {
        // Method 1 - Brute Force

        // int n = arr.length;

        // while(K>0)
        // {
        // int firstVal = arr[0];

        // for(int i=0; i<=n-2; i++){
        // arr[i] = arr[i+1];
        // }

        // arr[n-1] = firstVal;

        // K--;
        // }

        // Method 2 - Better

        int n = arr.length;
        K = K % n;

        // copy in temp till K
        int[] temp = new int[K];

        for (int i = 0; i < K; i++) {
            temp[i] = arr[i];
        }

        // Shifting elements by K position
        for (int i = K; i < n; i++) {
            arr[i - K] = arr[i];
        }

        // copying temp value to arr
        for (int i = n - K; i < n; i++) {
            arr[i] = temp[i - (n - K)];
        }

        // Method 3 - Optimal

        // int n = arr.length;

        // Reverse(arr, 0, K-1);
        // Reverse(arr, K, n-1);
        // Reverse(arr, 0, n-1);

    }

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }

        int K = scn.nextInt();

        rotateKTimes(arr, K);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        scn.close();

    }
}
/*
 * 
 * # INPUT
 * 6
 * 1 3 6 11 12 17
 * 4
 * 
 * # OUTPUT
 * 
 * 12 17 1 3 6 11
 * 
 */