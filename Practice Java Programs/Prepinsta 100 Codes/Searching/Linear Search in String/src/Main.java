public class Main {

    static boolean linearSearch(String words, char target){
        if(words.length() == 0)
            return false;

        for(int i=0; i<words.length(); i++){
            if(words.charAt(i) == target){
                return true; // found
            }
        }

        return false; // not found
    }

    static boolean linearSearch2(String words, char target){
        if(words.length() == 0)
            return false;

        // Note:- For each NOT works with String Directly,
        for(char element: words.toCharArray()){
            if(element == target){
                return true; // found
            }
        }

        return false; // not found
    }



    public static void main(String[] args) {

        String words = "hello john";
        char target = 'n';

        System.out.println(linearSearch(words, target));
        System.out.println(linearSearch2(words, target));

    }
}