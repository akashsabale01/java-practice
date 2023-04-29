public class Main {
    public static void main(String[] args) {
        Cylinder cl = new Cylinder(1, 20);
        System.out.println(cl.getVolume());

        cl.display();
    }
}

class Circle {
    private double radius;
    int x = 100;

    public Circle(double r) {
        radius = r;
    }

    public double getAreaOfCircle() {
        return (Math.PI * radius * radius);
    }
}

class Cylinder extends Circle {
    private double height;
    int x = 200;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getVolume() {
        return (getAreaOfCircle() * height);
    }

    public void display() {
        System.out.println("Value of x in Child class = " + x);
        System.out.println("Value of x in Parent class = " + super.x);
    }
}