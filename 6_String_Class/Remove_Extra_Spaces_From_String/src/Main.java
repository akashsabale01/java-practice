public class Main {
    public static String RemoveExtraSpaces(String sentence) {

        sentence = sentence.trim(); // Remove front & last spaces

        return sentence.replaceAll("\\s+", " ");
        // \s+ means replace one or more spaces, + means 1 or more spaces
    }
    public static void main(String[] args) {

        String sentence = "    hello    java    and python       world     ";

        System.out.println(RemoveExtraSpaces(sentence));
    }
}