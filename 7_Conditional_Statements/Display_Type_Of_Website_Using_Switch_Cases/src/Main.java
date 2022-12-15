public class Main {

    public static void printExtensionType(String extension){
        // Simple Switch Case

        switch (extension){
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organizational");
                break;
            case "net":
                System.out.println("network");
                break;
            case "edu":
                System.out.println("Educational");
                break;
            case "gov":
                System.out.println("Government");
                break;
            default:
                System.out.println("Invalid -- Not Found");
                break;
        }

        // Enhanced Switch Case
//        switch (extension) {
//            case "com" -> System.out.println("Commercial");
//            case "org" -> System.out.println("Organizational");
//            case "net" -> System.out.println("network");
//            case "edu" -> System.out.println("Educational");
//            case "gov" -> System.out.println("Government");
//            default -> System.out.println("Invalid");
//        }
    }

    public static String getExtension(String url){
        return  url.substring(url.lastIndexOf('.')+1);
    }

    public static void main(String[] args) {

        String url = "https://www.google.com";
        String url1 = "https://www.stanford.edu";
        String url2 = "https://www.bharat.gov";
        String url3 = "https://www.mysite.org";
        String url4 = "https://www.akash.net";
        String url5 = "https://www.tesla.codes";

        String extension = getExtension(url);
        String extension1 = getExtension(url1);
        String extension2 = getExtension(url2);
        String extension3 = getExtension(url3);
        String extension4 = getExtension(url4);
        String extension5 = getExtension(url5);

        printExtensionType(extension);
        printExtensionType(extension1);
        printExtensionType(extension2);
        printExtensionType(extension3);
        printExtensionType(extension4);
        printExtensionType(extension5);

    }
}