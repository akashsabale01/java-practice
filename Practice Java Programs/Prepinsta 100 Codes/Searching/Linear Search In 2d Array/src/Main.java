import java.util.Arrays;

public class Main {

    static int[] linearSearch(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1,-1};
    }

    static int getMax(int[][] twoDArr){
        int max = Integer.MIN_VALUE;

        for (int[] singleArr : twoDArr) {
            for (int element : singleArr) {
                if (element > max) {
                    max = element;
                }
            }
        }

        return max;
    }

    static int getMin(int[][] twoDArr){
        int min = Integer.MAX_VALUE;

        for (int[] singleArr : twoDArr) {
            for (int element : singleArr) {
                if (element < min) {
                    min = element;
                }
            }
        }

        return min;
    }

    static void print2DArray(int[][] arr){
        System.out.println("Arr = [ ");

        for(int[] singleArr: arr){
            for(int element: singleArr)
                System.out.print(element + " ");
            System.out.println();
        }
        System.out.println("]");
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3,4},
                {44,55,66,77},
                {4444,177,33,111}
        };

        int target = 1113;

        print2DArray(arr);

        // returning format {row,col} in which target present
        int[] ans = linearSearch(arr, target);
        System.out.println(Arrays.toString(ans));


        System.out.println(getMax(arr));
        System.out.println(getMin(arr));

    }
}
