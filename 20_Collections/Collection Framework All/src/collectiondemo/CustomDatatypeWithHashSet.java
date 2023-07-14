package collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class CustomDatatypeWithHashSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("John", 23));
        studentSet.add(new Student("Bob", 11));
        studentSet.add(new Student("Maria", 76));

        studentSet.add(new Student("Jay", 11));

        System.out.println(studentSet);
    }
}
