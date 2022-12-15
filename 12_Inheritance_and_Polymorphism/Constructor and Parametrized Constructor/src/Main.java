
class Rectangle{
    int length;
    int breadth;

    Rectangle(){
        length = breadth = 1;
        System.out.println("Non parameterized constructor of Rectangle class");
    }

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        System.out.println("Parameterized constructor of Rectangle class");

    }
}

class Cuboid extends Rectangle{
    int height;

    Cuboid(){
        height = 1;
        System.out.println("Non parameterized constructor of Cuboid class");

    }
    Cuboid(int height){
        this.height = height;
        System.out.println("Parameterized constructor with Single argument of Cuboid class");
    }

    Cuboid(int length, int breadth, int height){
        super(length,breadth);
        this.height = height;
        System.out.println("Parameterized constructor with All argument of Cuboid class");

    }

    int volume(){
        return  length * breadth * height;
    }
}

public class Main {
    public static void main(String[] args) {

        Cuboid obj = new Cuboid();
        System.out.println("Volume = " + obj.volume());
        /* Output
        Non parameterized constructor of Rectangle class
        Non parameterized constructor of Cuboid class
        Volume = 1
        * */

        Cuboid obj1 = new Cuboid(2);
        System.out.println("Volume = " + obj1.volume());
        /*  Output
        Non parameterized constructor of Rectangle class
        Parameterized constructor with Single argument of Cuboid class
        Volume = 2
        */

        Cuboid obj2 = new Cuboid(2,4,10);
        System.out.println("Volume = " + obj2.volume());
        /*  Output
        Parameterized constructor of Rectangle class
        Parameterized constructor with All argument of Cuboid class
        Volume = 80
        */


    }
}