import java.util.ArrayList;

public class Main {

    static String capitalizeEachWord(String sentence){
        sentence = sentence.trim();

        String[] arr = sentence.split(" ");

        for(String word: arr){
            word = word.substring(0, 1).toUpperCase() + word.substring(1,word.length());
        }

        String result = String.join(" ", arr);

        return result;
    }

    public static void main(String[] args) {

        String sentence = "Hello akash chandrakant sabale";

        String result = capitalizeEachWord(sentence);

        System.out.println(result);
    }
}