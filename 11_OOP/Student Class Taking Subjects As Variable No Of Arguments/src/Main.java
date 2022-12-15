import java.util.Arrays;

class Student {
    private String rollNo;
    private String studentName;
    private String departmentName;
    private String[] subjects;
    private int subjectsArrLen= 5; // Assuming only 5 subjects are there

    // Constructor
    public Student(String rollNo, String studentName, String departmentName) {
        this.rollNo = rollNo;
        this.departmentName = departmentName;
        this.studentName = studentName;
        this.subjects = new String[subjectsArrLen]; // Assuming only 5 subjects are there
    }

    public Student(String rollNo, String studentName) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.subjects = new String[subjectsArrLen]; // Assuming only 5 subjects are there

    }


    // Property Methods

    public void setSubjects(String... subjectsArgs) {
        // Ignore if subjectsArgs.length > 5
        if(subjectsArgs.length > 5)
            subjectsArrLen = 5;
        else
            subjectsArrLen = subjectsArgs.length;

        System.out.println("sssss "+subjectsArgs.length);
        System.out.println(subjects.length);

        for (int i = 0; i < subjectsArrLen; i++)
            subjects[i] = subjectsArgs[i];
    }

    public String getRollNO() {
        return rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void getSubjects() {
        for (int i = 0; i < subjectsArrLen; i++)
            System.out.println(subjects[i]);
    }

    // for result after printing object
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("ABC123", "John", "Computer");
        stud1.setSubjects("DBMS", "OS", "Networks", "Math", "Hadoop", "ML");
//        stud1.setSubjects("DBMS", "OS");

        System.out.println(stud1.getRollNO());
        System.out.println(stud1.getStudentName());
        System.out.println(stud1.getDepartmentName());

        System.out.println("\nSubjects are: ");
        stud1.getSubjects();
        System.out.println();

        System.out.println(stud1);

    }
}