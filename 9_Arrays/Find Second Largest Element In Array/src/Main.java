public class Main {

    public static int get2ndMax(int[] arr){

        if(arr.length == 0)
            return -1;

        int max1, max2;
        max1 = max2= arr[0];

        for(int i=1; i< arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2)
                max2 = arr[i];
        }
        return max2;
    }
    public static void main(String[] args) {

        int[] arr= {20,2,3,5,6,7,90};

        System.out.println("2nd Largest Number: " + get2ndMax(arr));
    }
}