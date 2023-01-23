import java.util.Scanner;

public class Main {

//    static String toggleCase(String name){
//        StringBuilder ans = new StringBuilder();
//
//        for(int i=0; i<name.length(); i++){
//            char ch = name.charAt(i);
//            if(ch>='A' && ch<='Z'){
//                ch = (char)(ch+32);
//                ans.append(ch);
//            }
//            else if(ch>='a' && ch<='z'){
//                ch = (char)(ch-32);
//                ans.append(ch);
//            }
//        }
//
//        return ans.toString();
//    }

    static String toggleCase(String name){
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(Character.isUpperCase(ch)){
                ans.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                ans.append(Character.toUpperCase(ch));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string = ");
        String name = scn.nextLine();

        System.out.println("\nAns: "+ toggleCase(name));
    }
}