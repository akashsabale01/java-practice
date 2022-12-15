import java.time.Year;

class Student{
    private String rollNo;
    private static int countForRollNo = 1;
    public String name;

    private String assignRollNo(){
        int currentYear = Year.now().getValue();
        String rNo = "Pune-" + currentYear + "-" + countForRollNo;
        countForRollNo++;
        return rNo;
    }

    public Student(String name){
        this.name = name;
        rollNo = assignRollNo();

    }

    public String getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Roll No='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("Akash");
        System.out.println(stud1.getRollNo());
        System.out.println(stud1);

        Student stud2 = new Student("Vijay");
        System.out.println(stud2.getRollNo());
        System.out.println(stud2);

        Student stud3 = new Student("Mari");
        System.out.println(stud3.getRollNo());
        System.out.println(stud3);
    }
}