public class Main {

    public static int getMax(int[] arr){

        if(arr.length == 0)
            return -1;

        int maxValue = arr[0];

        for(int i=1; i< arr.length; i++){
            if(arr[i] > maxValue)
                maxValue = arr[i];
        }
        return maxValue;
    }
    public static void main(String[] args) {

        int[] arr= {20,2,3,5,6,7,90};
        int[] arr1= {};

        System.out.println(getMax(arr));
        System.out.println(getMax(arr1));
    }
}