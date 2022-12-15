public class Main {
    public static String RemoveSpecialChars(String str){
        String validPattern = "[^a-bA-Z0-9]";

        return (str.replaceAll(validPattern, ""));
    }
    public static void main(String[] args) {

        String str = "a!bCD#145kf%a3DKA@&#";

        System.out.println(RemoveSpecialChars(str));

    }
}