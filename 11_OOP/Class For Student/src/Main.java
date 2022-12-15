
class Student{
    public int rollNo;
    public String name;
    public String course;
    public int phyMark, chemMark, mathMark;

    public int getTotal(){
        return phyMark + chemMark + mathMark;
    }

    public double getAverage(){
        return (double) getTotal() / 3;
    }

    public char getGrade(){
        double avg = getAverage();
        if(avg>=90 && avg<=100)
            return 'A';
        else if (avg>=75 && avg<90)
            return 'B';
        else if (avg>=55 && avg<75)
            return 'C';
        else if (avg>=35 && avg<55)
            return 'D';
        else
            return 'F';
    }

    public String getDetails(){
        return ("\nRoll No = "+rollNo+"\nName = "+name+"\nCourse = "+ course + "\n") ;
    }

    public String toString(){
        return ("\nRoll No = "+rollNo+"\nName = "+name+"\nCourse = "+ course + "\n") ;
    }



}

public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student();

        stud1.rollNo = 38;
        stud1.name = "Vijay";
        stud1.course = "Science";
        stud1.phyMark = 87;
        stud1.chemMark = 66;
        stud1.mathMark = 99;

        System.out.println(stud1.getDetails());
        System.out.println(stud1.getTotal());
        System.out.println(stud1.getAverage());
        System.out.println(stud1.getGrade());

        // o/p before toString() method = Student@7ef20235
        System.out.println(stud1);
        // If we print object then it automatically calls toString() method

        // o/p after toString() method :
        //Roll No = 38
        //Name = Vijay
        //Course = Science


    }
}