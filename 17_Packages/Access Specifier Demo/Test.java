import mypackage1.Demo1;

class Test{

    public static void main(String[] args){

        // Non Subclass Outside the package cannot access default,private,protected values
        obj.display();
        System.out.println(obj.a+ obj.b+ obj.c+ obj.d);
    }
}