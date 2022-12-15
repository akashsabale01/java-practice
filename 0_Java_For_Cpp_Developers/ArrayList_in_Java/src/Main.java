import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr= new ArrayList<>();

        System.out.println(arr + " " + arr.size()); // size will be 0 before initialization

        // Append / add at last --- .add(value)
        arr.add(10);
        arr.add(20);
        arr.add(30);

        // print ArrayList
        System.out.println(arr + " " + arr.size());

        // Add at particular index --- .add(index, value)
        arr.add(1, 15);
        System.out.println(arr);

        // get value of particular index -- .get(index)
        int val = arr.get(2);
        System.out.println(val);

        // set value of particular index -- .set(index, value)
        arr.set(0, 5);
        System.out.println(arr);

        // remove value of particular index -- .remove(index)
        arr.remove(3);
        System.out.println(arr);

        // Print using Loop
        for(int i=0; i<arr.size(); i++)
            System.out.println(arr.get(i));

        // Print using For each Loop
        for(int val1: arr)
            System.out.println(val1);

        // Sort

        // Creating ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Akash");

        System.out.println(names);

        // Print using For Loop
        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

        // Print using For each Loop
        for(String name: names){
            System.out.println(name);
        }




    }
}