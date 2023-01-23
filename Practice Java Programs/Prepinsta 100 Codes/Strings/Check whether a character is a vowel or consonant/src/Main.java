public class Main {

//    static boolean isVowel(char ch){
//        boolean isLowerVowel = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
//        boolean isUpperVowel = (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
//
//        return isUpperVowel || isLowerVowel;
//    }

    // using IndexOf method
//    static boolean isVowel(char ch){
//
//        String allVowels = "aeiouAEIOU";
//
//        return allVowels.contains(String.valueOf(ch));
//    }

    // Using Regex
    static boolean isVowel(char ch){

        String pattern = "[aeiouAEIOU]";

        return (String.valueOf(ch)).matches(pattern);
    }



    public static void main(String[] args) {

        char ch = 'a', ch1='b';

        System.out.println(isVowel(ch));
        System.out.println(isVowel(ch1));

    }
}