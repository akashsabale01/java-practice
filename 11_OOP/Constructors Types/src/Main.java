
class Cylinder{
    private double radius;
    private double height;

    public Cylinder(){
        radius = 1;
        height = 1;
    }

    public Cylinder(double r, double h){
        radius = r;
        height = h;
    }

    public void setRadius(double r){
        if(r <= 0)
            radius = 0;
        else
            radius = r;
    }
    public void setHeight(double h){
        if(h <= 0)
            height =0;
        else
            height = h;
    }

    public double getRadius(){
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double lidArea(){
        return (Math.PI * radius * radius);
    }

    public double circumference(){
        return (2 * Math.PI * radius);
    }

    public double totalSurfaceArea(){
        return 2 * lidArea() * circumference();
    }

}

public class Main {
    public static void main(String[] args) {

        Cylinder obj1 = new Cylinder(20.44, 55.22);

        // get & set are property methods
//        obj1.setRadius(20.12);
//        obj1.setHeight(40.22);

        System.out.println(obj1.getRadius());
        System.out.println(obj1.getHeight());

        System.out.println(obj1.lidArea());
        System.out.println(obj1.circumference());
        System.out.println(obj1.totalSurfaceArea());
    }
}