class Point{
    int x;
    int y;
}

class Shape{
    Point topLeft;
    Point bottomRight;
}



public class Main {

    public static void main(String[] args) {

        // Code for Point class

//        Point p1 = new Point();
//        p1.x = 10;
//        p1.y = 30;
//
//        System.out.println(p1.x + " " + p1.y);

        // Code for Shape class

        Shape s1 = new Shape();
        s1.topLeft = new Point();
        s1.bottomRight = new Point();

        s1.topLeft.x = 10;
        s1.bottomRight.y = 20;

        System.out.println(s1.topLeft.x + " " + s1.bottomRight.y);


    }
}