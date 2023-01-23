import java.util.Scanner;

public class Main {
	
//	static int getGreater(int num1, int num2) {
//		
//		return (num1 >= num2)? num1:num2;
//	}
	
	static void printGreatest(int num1, int num2) {
		
		if(num1 == num2) {
			System.out.println("Both are Equal");
		}
		else{
		
			int greatestNum = (num1 > num2)? num1:num2;
			System.out.println(greatestNum + " is Greatest number among them");
		}
	}
	
	static void printGreatestUsingInbuiltFunction(int num1, int num2) {
		
		if(num1 == num2) {
			System.out.println("Both are Equal");
		}
		else{
		
			int greatestNum = Math.max(num1, num2);
			System.out.println(greatestNum + " is Greatest number among them");
		}
	}

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter 1st number = ");
		int num1 = scn.nextInt();
		
		System.out.println("Enter 2nd number = ");
		int num2 = scn.nextInt();
		
		printGreatest(num1, num2);
		printGreatestUsingInbuiltFunction(num1, num2);
	}

}
