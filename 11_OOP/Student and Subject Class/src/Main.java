import java.util.Arrays;

class Subject{
    private String subId;
    private String subjectName;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subId, String subjectName){
        this.subId = subId;
        this.subjectName = subjectName;
    }
    public Subject(String subId, String subjectName, int maxMarks){
        this.subId = subId;
        this.subjectName = subjectName;
        this.maxMarks = maxMarks;
    }
    public Subject(String subId, String subjectName, int maxMarks, int marksObtained){
        this.subId = subId;
        this.subjectName = subjectName;
        this.maxMarks = maxMarks;
        this.marksObtained = marksObtained;
    }

    public String getSubId() {
        return subId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    public String toString() {
        return "Subject{" +
                "subId='" + subId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", maxMarks=" + maxMarks +
                ", marksObtained=" + marksObtained +
                '}';
    }
}

class Student{
    private String rollNo;
    private String studentName;
    private String departmentName;
    private Subject[] subjects;

    // Constructor
    public Student(String rollNo, String studentName, String departmentName){
        this.rollNo = rollNo;
        this.departmentName = departmentName;
        this.studentName = studentName;
    }

    public Student(String rollNo, String studentName){
        this.rollNo = rollNo;
        this.studentName = studentName;
    }


    // Property Methods

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
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

    public Subject[] getSubjects() {
        return subjects;
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

        Subject[] subjectsArr = new Subject[3];
        subjectsArr[0] = new Subject("A123", "DBMS", 100);
        subjectsArr[1] = new Subject("B456", "OS", 100);
        subjectsArr[2] = new Subject("C789", "Networks", 100);
//
//        for(Subject sub: subjectsArr)
//            System.out.println(sub);

        Student stud1 = new Student("ABC123", "John", "Computer");
        stud1.setSubjects(subjectsArr);

        System.out.println(stud1.getRollNO());
        System.out.println(stud1.getStudentName());
        System.out.println(stud1.getDepartmentName());

        Subject[] resultArr = stud1.getSubjects();

        for(Subject sub: resultArr)
            System.out.println(sub);

        System.out.println(stud1);

    }
}