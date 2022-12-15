public class Main {
    public static void main(String[] args) {

// We can check the type of a variable in Java by calling getClass().getSimpleName() method via the variable.

        // Use getClass().getSimpleName() to Check the Type of a Variable in Java

//        the below example illustrates how to use this function to check the type of non-primitive data types.
        String str = "Sample String";
        System.out.println(str.getClass().getSimpleName());

        String[] arr = new String[5];
        System.out.println(arr.getClass().getSimpleName());

//        This method is callable by objects only;
//        therefore, to check the type of primitive data types, we need to cast the primitive to Object first.

        int a= 20;
        System.out.println(((Object)a).getClass().getSimpleName());
    }
}

//  https://www.delftstack.com/howto/java/how-to-check-type-of-a-variable-in-java/