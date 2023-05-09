public class Main {
    public static void main(String[] args) {

        String s1 = new String("Hello"); // immutable  - fast
        StringBuffer s2 = new StringBuffer("Hello"); // mutable & thread safe - slower than String & StringBuilder class
        StringBuilder s3 = new StringBuilder("Hello"); // immutable & not thread safe - slower than String class - slower than String class & Faster than StringBuffer class

        s1.concat(" World"); // does not modify original string
        s2.append(" World"); // It modifies original string
        s3.append(" World"); // It modifies original string

        System.out.println(s1); // Output = Hello
        System.out.println(s2); // Output = Hello World
        System.out.println(s3); // Output = Hello World

        String s4 = s1.concat(" World");
        System.out.println(s4); // Output = Hello World


    }
}