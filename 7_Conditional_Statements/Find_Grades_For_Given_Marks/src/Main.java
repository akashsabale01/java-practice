public class Main {

    public static void printGrade(int mathsMarks, int physicsMarks, int chemistryMarks){
        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;
        float avgMarks = (float) totalMarks / 3;

        System.out.print("Grade: ");

        if(avgMarks >= 70)
            System.out.println("A");
        else if(avgMarks >=60 & avgMarks<70)
            System.out.println("B");
        else if (avgMarks >=50 & avgMarks<60)
            System.out.println("C");
        else if (avgMarks >=40 & avgMarks<50)
            System.out.println("D");
        else
            System.out.println("F");

    }

    public static void main(String[] args) {

        int mathsMarks= 98, physicsMarks=88, chemistryMarks = 76;

        printGrade(mathsMarks, physicsMarks, chemistryMarks);
    }
}