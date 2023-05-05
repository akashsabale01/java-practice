package langdemo;

class MyObject {
    @Override
    public String toString() {
        return "This is object of MyObject class";
    }

    @Override
    public int hashCode() {
        // Note: you should not override hashCode() method, because java creates unique hash for each object
        // here in below all objects of MyObject class have 100 as hashcode
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    /*
    * We are not able to override other methods like
    * notify(), notifyAll(), wait()
    * Because this methods are final
    * */
}


public class Main {
    public static void main(String[] args) {

        // java.lang.* package is imported automatically, it is given by default

        // 1) Object Class in java.lang

//        Object obj1 = new Object();
//        Object obj2 = new Object();
//        Object obj3 = obj1;

        // toString() method
//        System.out.println(obj1); // OUTPUT = java.lang.Object@e9e54c2
//        System.out.println(obj1.toString()); // OUTPUT = java.lang.Object@e9e54c2

//        System.out.println(obj1); // OUTPUT = java.lang.Object@e9e54c2
//        System.out.println(obj2); // OUTPUT = java.lang.Object@65ab7765
//        System.out.println(obj3); // OUTPUT = java.lang.Object@e9e54c2

        // equals() method
//        System.out.println(obj1.equals(obj2));
//        System.out.println(obj1.equals(obj3));

        // hashCode() method -
        // returns the hash code value of the object, there are no two programs created by java program	which have same hashcode.
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
//        System.out.println(obj3.hashCode());

        //  finalize() is like destructor
        // finalize() method is invoked by the garbage collector before object is being garbage collected.


        // ******** Overriding methods of object class ************

        MyObject mobj1 = new MyObject();
        MyObject mobj2 = new MyObject();

        System.out.println(mobj1);
        System.out.println(mobj2);

        System.out.println(mobj1.hashCode());
        System.out.println(mobj2.hashCode());

        System.out.println(mobj1.equals(mobj2));

    }
}