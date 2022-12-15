public class Main {

    public static void printTwoDArray(int[][] arr){
        System.out.println("Array : ");

        for(int i=0; i<arr.length; i++) // row
        {
            for(int j=0; j<arr[i].length; j++) // col
            {
                System.out.print(arr[i][j] + " ");;
            }
            System.out.println(); // new line after each row
        }

        System.out.println();
    }

    public static int[][] getSum(int[][] arr1, int[][] arr2){

        int[][] arr3 = new int[3][3];

        for(int i=0; i<arr1.length; i++) // row
        {
            for(int j=0; j<arr1[i].length; j++) // col
            {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return arr3;
    }

    public static void main(String[] args) {

        int[][] arr1 = {
                {1,2,3},
                {11,22,44},
                {99,77,33}
        };

        int[][] arr2 = {
                {10, 20, 30},
                {100, 200 ,300},
                {1000, 2000, 3000}
        };

        int[][] sumArr = getSum(arr1, arr2);

        printTwoDArray(sumArr);


    }
}