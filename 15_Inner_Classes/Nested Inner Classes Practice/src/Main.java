class Outer{
    int x = 10;
    Inner i = new Inner();

    class Inner{
        int y = 30;

        public void innerDisplay(){
            System.out.println(x +" "+y);
        }
    }

    public void outerDisplay(){
        // for accessing methods of inner class we must create object of inner class
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class Main {
    public static void main(String[] args) {

        Outer outerObj = new Outer();
        outerObj.outerDisplay();

//        Outer.Inner innerObj = new Outer().new Inner();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.innerDisplay();
        System.out.println(innerObj.y);

        /*
        NOTES:

            After compiling we wiLl have 3 files:
            Main.class  'Outer$Inner.class'   Outer.class

            - For accessing innerClass we need to create its object either in outer class which contains inner class
              or we can create object of inner class in main method by creating object of Outer class & inner class both
              e.g. Outer.Inner innerObj = new Outer().new Inner();

            - We can access data members of Outer class in inner class
            - We can access static data members of Outer class in inner class


         */
    }
}
