package collectiondemo;

import java.util.Objects;

public class StudentData implements Comparable<StudentData> {
    String name;
    int rollNo;

    public StudentData(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "StudentData {" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentData student = (StudentData) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(StudentData that) {
        return this.rollNo - that.rollNo;
    }
}
