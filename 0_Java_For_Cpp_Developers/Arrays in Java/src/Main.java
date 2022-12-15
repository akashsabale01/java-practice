public class Main {

//    int arr[] --- C style array declaration
//    int[] arr --- Java style array declaration
    public static void fun(int[] arr){
        arr[2] = 20;
        arr[3] = 30;

//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
    }

    public static void main(String[] args) {

//         Java Always create array in Heap

        int[] arr = new int[5];

        arr[0] = 100;
        arr[1] = 10;
        arr[4] = 40;

        fun(arr);

        // Check whether values are changing after calling function fun()
        for(int val: arr){
            System.out.println(val);
        }

    }
}