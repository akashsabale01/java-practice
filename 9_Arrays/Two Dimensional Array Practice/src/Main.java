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

    public static void printTwoDArrayUsingForEachLoop(int[][] arr){
        System.out.println("Array : ");

        for(int[] singleArr: arr) // "singleArr" contains reference to single array
        {
            for(int ele: singleArr) // "ele" contains elements in single array
            {
                System.out.print(ele + " ");
            }
            System.out.println(); // new line after each row
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // 1st way of 2d Array Creation - Declaration & Initialization separately

        int[][] arr = new int[5][5]; // Declaring

        // Initializing
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = 0;
            }
        }

        // 2nd way of 2d Array Creation - Declaration & Initialization combined
        int[][] arr2 = {
                {1,2,3,4},
                {11,22,44},
                {99,77,33,11}
        };

        printTwoDArray(arr2);
        printTwoDArrayUsingForEachLoop(arr2);


        // Jagged Array - all row have mostly different no of columns in 2d array
        int[][] jaggedArr = new int[3][];
        jaggedArr[0] = new int[4];
        jaggedArr[1] = new int[7];
        jaggedArr[2] = new int[2];

        // Initializing Jagged Array
        int num = 10;
        for(int i=0; i<jaggedArr.length; i++){
            for (int j=0; j<jaggedArr[i].length; j++){
                jaggedArr[i][j] = num++;
            }
        }

        printTwoDArray(jaggedArr);

        int[] E, F[];
        E = new int[5]; // E is 1 D array
        F = new int[7][]; // F is 2 D array


        System.out.println(arr.length);
        System.out.println(arr2.length);
    }
}