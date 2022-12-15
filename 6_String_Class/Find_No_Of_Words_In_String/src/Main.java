public class Main {

    public static int getNoOfWords(String sentence) {

        sentence = sentence.trim();
        sentence = sentence.replaceAll("\\s+", " ");
        // \s+ means replace one or more spaces, + means 1 or more spaces

        String[] wordList = sentence.split("\\s");

        return wordList.length;
    }
    public static void main(String[] args) {

        String sentence = "    abc   def    ddd eee  mara   kk  ";

        System.out.println(getNoOfWords(sentence));
    }
}