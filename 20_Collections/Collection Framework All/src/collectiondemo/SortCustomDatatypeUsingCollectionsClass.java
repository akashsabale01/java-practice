package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCustomDatatypeUsingCollectionsClass {
    public static void main(String[] args) {
        List<StudentData> list = new ArrayList<>();

        list.add(new StudentData("John", 23));
        list.add(new StudentData("Bob", 11));
        list.add(new StudentData("Maria", 76));

        StudentData s1 = new StudentData("Manoj",22);
        StudentData s2 = new StudentData("Guru",12);

//        System.out.println(s1.compareTo(s2));

        System.out.println(list);

//        Collections.sort(list); // sort based on rollNo

//        Collections.sort(list, new Comparator<StudentData>() {
//            @Override
//            public int compare(StudentData o1, StudentData o2) {
//                return (o1.name).compareTo(o2.name);
//            }
//        });

        Collections.sort(list, (o1,o2)-> (o1.name).compareTo(o2.name));

        System.out.println(list);
    }
}
