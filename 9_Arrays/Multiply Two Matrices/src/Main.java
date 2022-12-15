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

    public static int[][] productOfTwoArr(int[][] arr1, int[][] arr2){

        int[][] arr3 = new int[3][3];

        for(int i=0; i< 3; i++) {
            for(int j=0; j<3; j++) {

                arr3[i][j] = 0;
                for(int k=0; k<3; k++){
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
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
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int[][] result = productOfTwoArr(arr1, arr2);

        printTwoDArray(result);

    }
}