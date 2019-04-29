package day08_Chapter3;

import java.util.Scanner;

public class GradeCheck {

	private static final String Excellent = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int A= 90-100;
//int B= 80-89;
//int C= 70-79;
//int D= 60-69;

//Scanner scan = new Scanner(System.in);
//System.out.println("Enter your grade: ");
char grade = scan.next().charAt(0);
if(grade=='A') {
	
	System.out.println("Excellent Job! Keep it up!");
}else {
System.out.println("Your grade "+ grade+" is not good enough! ");
	System.out.println("How many points did you miss for 'A' ? ");
	int points = scan.nextInt();
	System.out.println("You could earn " + points + " more points if you studied! ");
	
	
	
	
	
}
	}

}
