public class Main {

//    static String removeAllVowels(String name){
//        // 1st way
//        StringBuilder ans = new StringBuilder();
//        String pattern = "aeiouAEIOU";
//
//        for(int i=0; i<name.length(); i++) {
//            char ch = name.charAt(i);
//            if (!pattern.contains(String.valueOf(ch))) {
//                ans.append(ch);
//            }
//        }
//        return ans.toString();
//    }

    // Using Regex
    static String removeAllVowels(String name) {
        String pattern = "[aeiouAEIOU]";

        String ans = name.replaceAll(pattern, "");

        return  ans;
    }


    public static void main(String[] args) {
        String name = "MadagaskarOmanRaidU";

        System.out.println(removeAllVowels(name));
    }
}