public class Main {

    public static  void print2DArr(int[][] arr){
        System.out.println("2d array: ");

        for(int i=0; i<arr.length; i++) // rows
        {
            for(int j=0; j<arr[i].length; j++) // columns
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Array having fix no of columns
//        int[][] arr = new int[2][3];
//
//        arr[0][0] = 11;
//        arr[0][1] = 12;
//        arr[0][2] = 13;
//
//        arr[1][0] = 21;
//        arr[1][1] = 22;
//        arr[1][2] = 23;
//
//        print2DArr(arr);

        // Jagged Array / Variable Sized array / array having variable no of columns
        int[][] arr = new int[2][];
        arr[0] = new int[2];
        arr[1] = new int[3];

        arr[0][0] = 11;
        arr[0][1] = 12;

        arr[1][0] = 21;
        arr[1][1] = 22;
        arr[1][2] = 23;

        print2DArr(arr);
    }
}