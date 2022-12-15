public class Main {
    public static void main(String[] args) {

        double totalSum = 0.0;

        for(String ele: args){
            if( ele.matches("[0-9\\.]+"))  // Checking if it is double value or not
            {
                double doubleNumber = Double.parseDouble(ele);
                totalSum += doubleNumber;
            }
        }

        System.out.println("Total Sum = " + totalSum);

    }
}

/*

--- OUTPUT ---

Adding Numbers Given By Command Line Arguments>cd src

Adding Numbers Given By Command Line Arguments\src>javac Main.java

Adding Numbers Given By Command Line Arguments\src>java Main 22 22.22 44.44 11
1.22 33.33
Total Sum = 233.20999999999998









*/