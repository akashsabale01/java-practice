public class Main {

    static void meth(){

        int l= -1, b= 33, area;

        try{
            if(l<0 || b<0) {
                throw new Exception("Dimensions of rectangle cannot be Negative");
            }

            area = l * b;
            System.out.println("Area = "+ area);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is final message, Which will be executed always whether Exception occurred or not");
        }


    }

    public static void main(String[] args) {

        meth();
    }
}