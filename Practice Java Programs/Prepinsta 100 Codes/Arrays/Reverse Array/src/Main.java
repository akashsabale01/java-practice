import java.util.Arrays;

public class Main {

    static void reverseArr(int[] arr){
        for(int i=0, j=arr.length-1; i<j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        reverseArr(arr);

        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println(Arrays.toString(arr));

    }
}