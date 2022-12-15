import java.lang.String;

public class Main {
    public static void main(String[] args) {

//        /*
//        Each time you create a string literal, the JVM checks the "string constant pool" first.
//        If the string already exists in the pool, a reference to the pooled instance is returned.
//        If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
//        */
//        String str1 = "akash";
//        System.out.println(str1);
//
//        /*
//        In such case, JVM will create a new string object in normal (non-pool) heap memory, and
//        the literal "Welcome" will be placed in the string constant pool.
//        The variable s will refer to the object in a heap (non-pool).
//        */
//        String str2 = new String("ruby");
//        System.out.println(str2);
//
////        Array of characters is taken and is converted into string.
//        char[] ch = {'k','i','n','g'};
//        String str3 = new String(ch);
//        System.out.println(str3);
//        String str4 = new String(ch, 1, 2);
//        System.out.println(str4);
//
////        Array of bytes is taken and is converted into a string.
//        byte[] b = {65,66,67,68,69};
//        String str5 = new String(b);
//        System.out.println(str5);
//        String str6 = new String(ch, 1, 2);
//        System.out.println(str6);

/* *********** String Methods ******************** */

        String s1="Pyramid";
        String s2="Pyramid";
        String s3 = "pyramid";
        String s4 = new String("Pyramid");

        System.out.println("Length of s1 = " + s1.length());

        char firstChar = s1.charAt(0);
        System.out.println(firstChar);

        int lastCharIdx = s1.indexOf('d');
        System.out.println(lastCharIdx);

        String temp2 = "compiled and interpreted";
        int andStringStartIdx = temp2.indexOf("and");
        System.out.println(andStringStartIdx);

        String s1Lower = s1.toLowerCase();
        System.out.println(s1Lower);

        String s1Upper = s1.toUpperCase();
        System.out.println(s1Upper);

        System.out.println("Comparison by .equals() method");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        System.out.println("Comparison by == operator");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);

        String lang1 = "JAVA";
        String lang2 = "java";
        System.out.println(lang1.equalsIgnoreCase(lang2));

        String unTrimmed = "     welcome      ";
        System.out.println("UnTrimmed string = " + unTrimmed);

        unTrimmed = unTrimmed.trim();
        System.out.println("Trimmed string = " + unTrimmed);

        String sentence = "hello world of java";
        String subStr1 = sentence.substring(6);
        String subStr2 = sentence.substring(6,10);
        // here in substring(startIdx, endIdx), startIdx is including  & endIdx is excluding so upto endIdx-1 =10-1= 9 printed
        System.out.println(subStr1);
        System.out.println(subStr2);

        String temp1 = "Mari";
        temp1 = temp1.replace('r','h');
        System.out.println(temp1);

        String url = "https:\\www.akash.com";
        System.out.println(url.startsWith("https"));
        System.out.println(url.endsWith(".com"));

        String tmp1 = "Pyramid";
        String tmp2 = new String("Pyramid");
        String tmp3 = "pyramid";
        String tmp4 = "china";

        System.out.println(tmp1.compareTo(tmp2)); // 0
        // here both are same & so ascii also same , Hence result > 0

        System.out.println(tmp3.compareTo(tmp2)); // result >0,
        // here ascii(p) > ascii(P) , Hence result > 0, which gives difference between two char's ascii of mismatched char

        System.out.println(tmp4.compareTo(tmp3));
        // here ascii(c) < ascii(p) , Hence result < 0, which gives difference between two char's ascii of mismatched char

        String t1 = "JAVA", t2="java";
        System.out.println(t1.compareTo(t2));

        String location = "Great wall of china";
        System.out.println(location.contains("china"));

        String locationCity = "venezuyala";

        System.out.println(location + "," + locationCity);
        System.out.println(location.concat(locationCity));
        System.out.println(location.concat(" " + locationCity));













    }
}