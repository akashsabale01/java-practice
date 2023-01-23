public class Main {

    static String getReverse(String word){

        // 1st way

//        StringBuilder ans = new StringBuilder(word);
//
//        for(int i=0,j=word.length()-1; i<j; i++,j--){
//            char temp = ans.charAt(j);
//            ans.setCharAt(i,ans.charAt(j));
//            ans.setCharAt(j,temp);
//        }
//        return ans.toString();

        // 2nd way to reverse

//        StringBuilder ans = new StringBuilder(word);
//        ans.reverse();
//        return ans.toString();

        // 3rd way to reverse - Using Char Array

        char[] arr = word.toCharArray();

        for(int i=0,j=arr.length-1; i<j; i++,j--){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return String.valueOf(arr);

    }
    static boolean isPalindrome(String word){
        // 1st way
//        for(int i=0,j=word.length()-1; i<j; i++,j--){
//            if(word.charAt(i) != word.charAt(j))
//                return false;
//        }
//        return true;

        // 2nd way
        String rev = getReverse(word);
        return rev.equals(word);
    }

    public static void main(String[] args) {

        String word1 = "tenet", word2= "mahan";

        System.out.println(isPalindrome(word1));
        System.out.println(isPalindrome(word2));
    }
}