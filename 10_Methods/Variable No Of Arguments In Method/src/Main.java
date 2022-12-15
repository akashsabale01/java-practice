public class Main {

    public static void show(int ...args){

        for(int ele: args){
            System.out.println(ele);
        }
    }

    public static void showByArray(int[] arr){

        for(int ele: arr){
            System.out.println(ele);
        }
    }

    public static void showList(int start, String ...names){

        for(int i=0; i<names.length; i++){
            System.out.println(start + " "+ names[i]);
            start++;
        }
    }

    public static void main(String[] args) {

        // Variable no of arguments are show by
        //    datatype ...argumentsName
        // e.g.   int ...args

        // Note - all parameters must be same type while passing variable no of arguments

        // Internally when we pass variable no of arguments to method,
        // Then method will create array containing given arguments

        show();
        show(12);
        show(23,45,21,55);


        // So passing Anonymous array -
        // (i.e. Array which have no reference, it will be passed to method & deleted after method execution)

        show(new int[]{123, 345, 214, 114});


        // 2. Show by array ****************
        // here we required Anonymous array to create when we want to pass more no of parameters

//        showByArray(null); // this gives exception
        showByArray(new int[]{12});
        showByArray(new int[]{23, 45, 21, 55});
        showByArray(new int[]{123, 345, 214, 114});

        // variable no of arguments should be last parameter in method
        showList(5, "akash", "john", "vetri", "victor", "mike");
    }
}