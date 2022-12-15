
class Circle{
    public double radius;

    public double getArea(){
        return (Math.PI * radius * radius);
    }
    public double getPerimeter(){
        return (2 * Math.PI * radius);
    }
    public double getCircumference(){
        return getPerimeter();
    }
}

public class Main {
    public static void main(String[] args) {

        Circle obj1 = new Circle();

        obj1.radius = 10;
        System.out.println("Radius = " + obj1.radius);

        System.out.println("Area = " + obj1.getArea());
        System.out.println("Perimeter = " + obj1.getPerimeter());
        System.out.println("Circumference = " + obj1.getCircumference());

    }
}