import java.util.Scanner;

class Main {

    static String removeAllOccurrencesOfChar(String input, char c) {

         StringBuilder ans = new StringBuilder();

         for(int i=0; i<input.length(); i++){
             char ch = input.charAt(i);
             if(ch != c)
                 ans.append(ch);
         }
        return ans.toString();

         // 2nd way

//        String ans = "" ;
//        for(int i=0; i<input.length(); i++){
//            char ch = input.charAt(i);
//            if(ch != c)
//                ans += (ch);
//        }
//        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string and char to remove: ");
        String input = sc.next();
        char c = sc.next().charAt(0);

        String ans = removeAllOccurrencesOfChar(input, c);

        System.out.println("Ans = "+ ans);
    }
}