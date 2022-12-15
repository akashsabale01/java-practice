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

    // Multiplication of Matrices :-
    // Time Complexity: O(M2*N), as we are using a nested loop for traversing.
    // Auxiliary Space: O(M*N), as we are using extra space.
    public static void productOfTwoArr(int[][] arr1, int noOfRow1, int noOfCol1, int[][] arr2, int noOfRow2, int noOfCol2){

        if(noOfCol1 != noOfRow2){
            System.out.println("\nMultiplication Not Possible");
            return;
        }

        int[][] arr3 = new int[noOfRow1][noOfCol2];

        for(int i=0; i< noOfRow1; i++) {
            for(int j=0; j<noOfCol2; j++) {
                arr3[i][j] = 0;
                for(int k=0; k<noOfRow2; k++){
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        printTwoDArray(arr3);
    }

    public static void main(String[] args) {


        int[][] arr1 = {
                { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 }
        };
        int noOfRow1 = 4, noOfCol1 = 3;


        int[][] arr2 = {
                { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 }
        };

        int noOfRow2 = 3, noOfCol2 = 4;

        productOfTwoArr(arr1, noOfRow1, noOfCol1, arr2, noOfRow2, noOfCol2);

    }
}

// https://www.geeksforgeeks.org/java-program-to-multiply-two-matrices-of-any-size/