public class Main {

    public static void printArr(int[] arr){
        System.out.println("arr = ");

        for(int ele: arr)
            System.out.print(ele + " ");

        System.out.println();
    }
    public static void leftRotate(int[] arr){
        int zerothChar = arr[0];

        // Shifting
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = zerothChar;

        printArr(arr);
    }

    public static void rightRotate(int[] arr){
        int n = arr.length;
        int lastChar = arr[n-1];

        // Shifting
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = lastChar;

        printArr(arr);
    }


    public static void main(String[] args) {

        int[] arr= {20,2,3,5,6,7,90};
        int[] arr2= {80,2,30,50,6,7,70};

        printArr(arr);
        leftRotate(arr);

        System.out.println();

        printArr(arr2);
        rightRotate(arr2);
    }
}