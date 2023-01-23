import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>(3);

//        list.add(10);
//        list.add(20);
//        list.add(40);
//        list.add(50);
//        list.add(160);
//
//        System.out.println(list);
//
//        System.out.println(list.contains(40));
//
//        list.remove(0);
//        System.out.println(list);

        // Taking custom ArrayList
        Scanner scn = new Scanner(System.in);

//        System.out.println("Enter 5 numbers: ");
//        for(int i=0; i<5; i++){
//            list.add(scn.nextInt());
//        }

//        System.out.println(list);
//
//        // Accessing single element ---Note: a[3] not works in ArrayList
//        System.out.println(list.get(3));
//
//        /// Updating single element
//        list.set(0, 99);
//        System.out.println(list);

        // Multidimensional ArrayList
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

        // Initialization
        for(int i=0; i<3; i++){
            multiList.add(new ArrayList<>());
        }

        // add Elements
        System.out.println("Enter elements: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                multiList.get(i).add(scn.nextInt());
            }
        }

        System.out.println(multiList);

    }
}