import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ******* In java, Strings are created in Heap by Default *******
//
//        Scanner scn = new Scanner(System.in);
//
//        // 1st way to take string input sequentially - Handle & Store enter by using scn.nextLine()
//
//        System.out.print("Enter your name = ");
//        String name = scn.next();
//        System.out.println("Your name = "+ name);
//
//        scn.nextLine(); // It Stores Enter clicked after entering 1st/Above input
//
//        System.out.print("Enter your Full Name = ");
//        String fullName = scn.nextLine();
//        System.out.println("Your name = "+ fullName);
//
//        // 2nd way to take string input sequentially - Use scn.nextLine() only instead of scn.next() for taking string
//
//        System.out.print("Enter your name = ");
//        String name1 = scn.nextLine();
//        System.out.println("Your name = "+ name1);
//
//        System.out.print("Enter your Full Name = ");
//        String fullName1 = scn.nextLine();
//        System.out.println("Your name = "+ fullName1);
//
//        // Link of this issue: https://stackoverflow.com/questions/48475000/why-cant-i-input-two-string-consecutively-in-java
//
//        // Find Length of String --- .length()
//        System.out.println("Enter job : ");
//        String job = scn.nextLine();
//        System.out.println(job);
//
//        System.out.println(job.length());
//
//        // get char at particular index --- .charAt(index)
//        char firstCh = job.charAt(0);
//        System.out.println(firstCh);
//
//        int n = job.length();
//        for(int i=0; i<n; i++){
//            char ch = job.charAt(i);
//            System.out.println(ch);
//        }

        // **** In Java, Strings are immutable, We can't change any character of string ****
        // **** THERE IS NO setChar() Function in Java ****
//        job.charAt(1)= 'R'; // This NOT Works -- WRONG

    // Substring
        /*
        *   .substring(startIdx, endIdx) -> it returns string starting from startIdx to (endIdx - 1)
        *   Note-> here endIdx is Exclusive & startIdx is Inclusive
        *
        *   .substring(startIdx)  -> it returns string starting from startIdx to the end of string
        *
        *   Note-> startIdx <= endIdx always if not then Program will give Error
        *
        * */

        String s1 = "abcd";

        System.out.println(s1.substring(0,1));

        // Below will print Blank space because end index is exclusive
        System.out.println(s1.substring(0,0));

        System.out.println(s1.substring(0));

         // Print All Substrings for give string

        System.out.println("Substrings are: ");
        for(int i=0; i<s1.length(); i++){
            for(int j= i+1; j<=s1.length(); j++){
                System.out.println(s1.substring(i,j));
            }
        }

         // Concatenation

        String st1 = "Hi", str2="akash";
        String message = st1 + " " + str2;
        System.out.println(message);

         // you can add char to string
         // also if you add int to string then internally int will be converted to string while concatenating
        String zebra = "White";
        zebra += ' ';
        zebra += 'b';
        zebra += 'l';
        zebra += 'k';
        zebra += 10;
        System.out.println(zebra);

        // Split() fun
        String sentence = "Lorem impsum generator dolor colon";

        String sentence1 = "Lorem,impsum,generator,dolor colon";
        String[] words = sentence.split(" ");
        String[] wordsList1 = sentence1.split(",");

        for(int i=0 ;i<words.length; i++){
            System.out.println(words[i]);
        }

        for(String word: wordsList1){
            System.out.println(word);
        }





    }
}