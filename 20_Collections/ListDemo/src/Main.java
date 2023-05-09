import java.util.*; // for including collection framework

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>(10);
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(30,40,50,60));

        arr1.add(20);
        arr1.add(0,10);
        arr1.addAll(arr2);
//        arr1.addAll(0, arr2);

//        System.out.println(arr2.contains(50));

//        System.out.println(arr1.get(2));
//        arr1.set(1,15);

//        arr1.add(40);
//        System.out.println(arr1.indexOf(40));
//        System.out.println(arr1.lastIndexOf(40));

//        arr1.removeAll(arr2); // removes matching element only
//        arr1.retainAll(arr2); // removes all element other than matching element

        // Printing ArrayList

        System.out.println(arr1);

        // Note:- Similar methods are there in LinkedList Class also

        // Iterating ArrayList

//        for(int i=0; i<arr1.size(); i++){
//            System.out.print(arr1.get(i) + " ");
//        }

//        System.out.println();

//        for(Integer ele: arr1){
//            System.out.print(ele + " ");
//        }
//
//        for(var ele: arr1){
//            System.out.print(ele + " ");
//        }
//
//        for(Iterator<Integer> it = arr1.iterator(); it.hasNext();){
//            System.out.print(it.next() + " ");
//        }
//
//        System.out.println();
//
//        for(ListIterator<Integer> it = arr1.listIterator(); it.hasNext();){
//            System.out.print(it.next() + " ");
//            // here it.previous() is available
//        }

//        System.out.println();

        // Lambda expression ************

//        // for single statement
//        arr1.forEach(element -> System.out.print(element + " "));
//
//        // for multiple statements
//        arr1.forEach((element) -> {
//            System.out.print(element + " ");
//        });

        // calling custom function
        arr1.forEach((element)-> show(element));
    }

    static void show(int n){
        if (n<=30){
            System.out.print(n + " ");
        }
    }
}