
class NegativeDimensionException extends Exception{

    public String toString() {
        return "Dimensions of rectangle cannot be Negative";
    }
}


public class Main {
    static int getArea(int l, int b) throws Exception {

        if(l<0 || b<0  )
            throw new NegativeDimensionException();

        return l * b;
    }

    static void meth2(){
        try{

            System.out.println("Area : "+ getArea(20,0));
        }
         catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        meth2();
    }
}