
class Rectangle{
    int length;
    int width;

    void insert(int l, int w){
        length = l;
        width = w;
    }

    void getArea(){
        int area = length * width;
        System.out.println( "Area = " + area);
    }
}


public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.insert(20,30);
        r1.getArea();

        r2.insert(10,80);
        r2.getArea();
    }
}