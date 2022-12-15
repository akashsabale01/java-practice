public class Main {
    public static void isValidDateFormat(String givenDate){

        String validPattern = "[0-3][1-9]/[01][1-9]/[0-9]{4}";

        System.out.println(givenDate.matches(validPattern));
    }
    public static void main(String[] args) {

        String givenDate1 = "26/12/2001";
        String givenDate2 = "40/09/2001";
        String givenDate3 = "20/41/2002";
        String givenDate4 = "20/01/20";

        isValidDateFormat(givenDate1);
        isValidDateFormat(givenDate2);
        isValidDateFormat(givenDate3);
        isValidDateFormat(givenDate4);


    }
}