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
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class Main {
    public static void main(String[] args) {

        Outer outerObj = new Outer();
        outerObj.outerDisplay();

        Outer.Inner innerObj = new Outer().new Inner();
        innerObj.innerDisplay();
        System.out.println(innerObj.y);
    }
}