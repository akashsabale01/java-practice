public class Main {
    public static void main(String[] args) {

// ****** A) Matching symbols ****
//        These symbols are meant for single alphabets.
//
////         ‘.’ it means any letter or the symbol from the keyboard.i.e for single alphabet it is true.
//        String str1 = "y"; // Requires exact 1 characters
//        System.out.println(str1.matches("."));
//
////        [abc]: range or set of characters/ the string is true if the alphabet is either a or b or c.
//        System.out.println(str1.matches("[abc]"));
//
////        [^abc]: the string is true if the symbol is other than a, b, & c.
//        System.out.println(str1.matches("[^abc]"));
//
////        [a-z 1-7]: the string is true if any symbol is from the range a-z or 1-7.
//        String str2 = "d", str3="8", str4="A", str5="#"; // Requires exact 1 characters
//        System.out.println(str2.matches("[a-z0-9]"));
//        System.out.println(str3.matches("[a-z0-9]"));
//        System.out.println(str4.matches("[a-z0-9]"));
//        System.out.println(str5.matches("[a-z0-9]"));
//
////        [abc][vz]: range of multiple symbol/the string is true if first symbol is among a,b &c and
////        second symbol is among v & z.
//
//        String str6 = "a3"; // Requires exact 2 characters
//        String str7 = "a", str8 = "3", str9 = "k4g";
//        System.out.println(str6.matches("[a-z][0-9]"));
//        System.out.println(str7.matches("[a-z][0-9]"));
//        System.out.println(str8.matches("[a-z][0-9]"));
//        System.out.println(str9.matches("[a-z][0-9]"));
//
////        A|B: it is true for single alphabets either A or b.
//        String str10 = "k", str11 = "A", str12 = "b";
//        System.out.println(str10.matches("A|b"));
//        System.out.println(str11.matches("A|b"));
//        System.out.println(str12.matches("A|b"));
//
////        XZ: to check whether the string maybe either a single or multiple alphabets
//        // Checks exact string or not
        String str13 = "xyz", str14 = "x", str15 = "xyza";
        System.out.println(str13.matches("xyz"));
        System.out.println(str14.matches("xyz"));
        System.out.println(str15.matches("xyz"));
        System.out.println();
//
////        Meta characters:
//
//        String tmp1 = "8", tmp2="a", tmp3=" ", tmp4="*";
//
////        \d: it will be true if it is a digit among 0-9.
//        System.out.println(tmp1.matches("\\d"));
//        System.out.println(tmp2.matches("\\d"));
//        System.out.println(tmp3.matches("\\d"));
//        System.out.println(tmp4.matches("\\d"));
//
////        \D: it will be true if it is any symbol other than digits.
//        System.out.println(tmp1.matches("\\D"));
//        System.out.println(tmp2.matches("\\D"));
//        System.out.println(tmp3.matches("\\D"));
//        System.out.println(tmp4.matches("\\D"));
//
////        \s: it will be true if  there is just a space.
//        System.out.println(tmp1.matches("\\s"));
//        System.out.println(tmp2.matches("\\s"));
//        System.out.println(tmp3.matches("\\s"));
//        System.out.println(tmp4.matches("\\s"));
//
////        \S: it will be true if there are any symbols other than space.
//        System.out.println(tmp1.matches("\\S"));
//        System.out.println(tmp2.matches("\\S"));
//        System.out.println(tmp3.matches("\\S"));
//        System.out.println(tmp4.matches("\\S"));
//
////       \w: it will be true if it is either alphabet or digits.
//        System.out.println(tmp1.matches("\\w"));
//        System.out.println(tmp2.matches("\\w"));
//        System.out.println(tmp3.matches("\\w"));
//        System.out.println(tmp4.matches("\\w"));
//
////       \W: it will be true if it is any symbol other than alphabets or digits.
//        System.out.println(tmp1.matches("\\W"));
//        System.out.println(tmp2.matches("\\W"));
//        System.out.println(tmp3.matches("\\W"));
//        System.out.println(tmp4.matches("\\W"));

//  ************    Quantifiers : these are used to define the number of symbols you want.

//        ’*’ it represents number of occurrences of any of the characters for zero or more times.
        String s1 ="abcd", s2=" ";
        System.out.println(s1.matches(".*"));
        System.out.println(s2.matches(".*"));

//        ’+’ it represents number of occurrences of any of the character for one or more times
        String s3 ="abcabcaabbcc";
        System.out.println(s3.matches("[abc]+"));
        System.out.println(s2.matches("[abc]+"));

//        {X} it represents any of the characters for the size of X value given.
//        {X, Y} it represents any of the characters for the min and max size given.
        String s4= "accdd";
        System.out.println(s4.matches("[abc]{5}"));
        System.out.println(s4.matches("[abc]{2}"));
        System.out.println(s4.matches("[abc]{2,4}"));

        // check valid email
        String email1 = "jhon123@gmail.com",email2 = "brad@gmail.com", email3 = "jhon-anton@gmail.com";
        String email4="jhon12@yahoo.com";

        System.out.println(email1.matches("\\w+@gmail(.+)"));
        System.out.println(email2.matches("\\w+@gmail(.+)"));
        System.out.println(email3.matches("\\w+@gmail(.+)"));
        System.out.println(email4.matches("\\w+@gmail(.+)"));







































//        find no of vowels
//        String sentence = "abcdefghiABCDEFGHI";
//        int vowelCount = 0;
//        for(int i=0; i<sentence.length(); i++){
//            if(sentence.matches("[aeiouAEIOU]")){
//                System.out.println(sentence.charAt(i));
//                vowelCount++;
//            }
//        }


    }
}