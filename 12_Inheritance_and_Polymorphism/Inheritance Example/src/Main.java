class Circle{
    public double radius;

    public double getArea(){
        return (Math.PI * radius * radius);
    }
}

class Cylinder extends Circle{
    public double height;

    public double getVolume(){
        return  getArea() * height;
    }
}

public class Main {
    public static void main(String[] args) {

        Cylinder obj1 = new Cylinder();

        obj1.radius = 7;
        obj1.height = 10;

        System.out.println("Radius = " + obj1.radius);
        System.out.println("Height = " + obj1.height);

        System.out.println("Area = " + obj1.getArea());
        System.out.println("Volume = " + obj1.getVolume());

    }
}