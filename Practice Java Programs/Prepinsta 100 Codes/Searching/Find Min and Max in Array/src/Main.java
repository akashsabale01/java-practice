import java.util.Arrays;
import java.util.Collections;

public class Main {

    static int getMin(int[] arr){
        if(arr.length == 0)
                return -1;

        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
        }

        return min;
    }

    static int getMax(int[] arr){
        if(arr.length == 0)
                return -1;

        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {-3,2,1,4,-23, 33,55,22};

        System.out.println(getMin(arr));
        System.out.println(getMax(arr));

    }
}