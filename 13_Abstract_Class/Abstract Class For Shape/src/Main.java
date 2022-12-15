
abstract class Shape{

    abstract public double area();
    abstract public double perimeter();
}

class Circle extends Shape{
    public double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape{
    public double length;
    public double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        return length * breadth;
    }

    public double perimeter(){
        return 2 * (length + breadth);
    }
}

public class Main {
    public static void main(String[] args) {

        Shape obj = new Circle(33.22);
        System.out.println("Area = " + obj.area());
        System.out.println("Perimeter = " + obj.perimeter());

        System.out.println();

        obj = new Rectangle(22.22 ,52.22);
        System.out.println("Area = " + obj.area());
        System.out.println("Perimeter = " + obj.perimeter());

    }
}