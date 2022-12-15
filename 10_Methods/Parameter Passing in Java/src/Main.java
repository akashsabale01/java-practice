public class Main {

    static void increment(int a){
        a++;
            System.out.println("value of a in Function = " + a);
        }
    static void incrementArr(int[] arr){
        arr[0]++;
        System.out.println("value of arr[0] in Function = " + arr[0]);
    }

    static int getSum(int a, int b){
        return a+b;
    }

    static int[] doubleArray(){

        int[] arr2 = {1,2,3,4,5,6};

        for(int i=0; i<arr2.length; i++)
            arr2[i] *= 2;

        return arr2;
    }


    public static void main(String[] args) {

        // 1. primitive datatype are passed by value, both local & functional copy are different
        // *** => Internally value of actual parameters is copied to formal parameters
        int a= 38;
        increment(a);
        System.out.println("value of a Outside of Function = " + a);

        // 2. Non-primitive datatype (i.e. Objects) are passed by value,
        // *** => Internally reference of object is copied from actual parameters to formal parameters
        // both local & functional copy are same only reference is different

        int[] arr = {1,2,3,4};
        incrementArr(arr);
        System.out.println("value of arr[0] in Function = " + arr[0]);

        // ** Returning from methods

        // 1. primitive type
        // value is copied
        int x=34, y=66;
        int sum = getSum(x, y);
        System.out.println("Sum = " + sum);

        // 2. Non-primitive type (Objects) like array, string ,etc
        // Reference to object in heap is copied


        int[] doubledArr = doubleArray();

        System.out.print("\nArray: ");
        for(int ele: doubledArr)
            System.out.print(ele + " ");




    }
}