
public class Main {

    static void printArr(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");

        System.out.println();
    }

    static void reverseArr(int[] arr) {
        // 1st method

        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            temp[i] = arr[j];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String args[]) {

        int[] arr = new int[5];

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i] = 2 * (i + 1);
        }

        printArr(arr);

        reverseArr(arr);

        printArr(arr);

    }
}