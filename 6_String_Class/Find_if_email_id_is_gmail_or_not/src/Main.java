public class Main {

    public static void checkValid(String email){

        int indexOfAtTheRate = email.indexOf("@");
        int indexOfDot = email.indexOf(".");

        // 1st Approach - Use Loop
//        String givenMailHost = "";
//        for(int i=indexOfAtTheRate+1; i<indexOfDot; i++){
//            givenMailHost += email.charAt(i);
//        }
//        System.out.println(givenMailHost);

        // 2nd Approach - Use substring() method
        String givenMailHost = email.substring(indexOfAtTheRate+1, indexOfDot);

        if(givenMailHost.equals("gmail"))
            System.out.println(email + " is from gmail");
        else
            System.out.println(email + " is Not from gmail");
    }

    public static String getUsername(String email){
        int indexOfAtTheRate = email.indexOf("@");

        // 1st Approach - Use Loop
//        String username = "";
//        for(int i=0; i<indexOfAtTheRate; i++){
//            username += email.charAt(i);
//        }

        // 2nd Approach - Use substring() method
        String username = email.substring(0, indexOfAtTheRate);

        return username;
    }

    public static String getDomainName(String email){

        int indexOfAtTheRate = email.indexOf("@");

        // 1st Approach - Use Loop
//        String domainName = "";
//        for(int i=indexOfAtTheRate+1; i<email.length(); i++){
//            domainName += email.charAt(i);
//        }

        // 2nd Approach - Use substring() method
        String domainName = email.substring(indexOfAtTheRate+1);

        return domainName;
    }

    public static void main(String[] args) {
        
        String email1 = "john123@gmail.com", email2="ash421@yahoo.com";

        checkValid(email1);
        System.out.println("Username: " + getUsername(email1));
        System.out.println("Domain Name: " + getDomainName(email1));

        System.out.println();

        checkValid(email2);
        System.out.println("Username: " + getUsername(email2));
        System.out.println("Domain Name: " + getDomainName(email2));


    }
}