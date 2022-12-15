public class Main {
    public static void main(String[] args) {

//        // Create
//        StringBuilder str1 = new StringBuilder("Akash");
//        System.out.println(str1);
//
//        // get char of particular index
//        char ch1 = str1.charAt(0);
//        System.out.println(ch1);
//
//        // set
//        str1.setCharAt(0,'a');
//        System.out.println(str1);
//
//        // Append
//        str1.append("CS");
//        System.out.println(str1);
//
//        // Insert at particular index
//        str1.insert(0,'a');
//        System.out.println(str1);
//
//        // delete
//        str1.deleteCharAt(0);
//        System.out.println(str1);
//
//        System.out.println(str1.length());

        // Comparing with String
//        String takes -> O(n*n) time
//        StringBuilder takes -> O(n) time

        int n = 100000;

        String s1 = "a";
        long startTime1 = System.currentTimeMillis();
        for(int i=0; i<n; i++){
            s1 += i;
        }
        long endTime1 = System.currentTimeMillis();
        long duration1 = endTime1 - startTime1;
        System.out.println(duration1); // required 4729 ms for n=100000

        StringBuilder s2 = new StringBuilder("a");
        long startTime2 = System.currentTimeMillis();
        for(int i=0; i<n; i++){
            s2.append(i);
        }
        long endTime2 = System.currentTimeMillis();
        long duration2 = endTime2 - startTime2;
        System.out.println(duration2); // required 10 ms for n=100000

//        So StringBuilder takes less time than normal String



    }
}