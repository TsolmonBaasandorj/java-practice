package day12_calculator;

import java.util.Scanner;

public class gradeSwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter your grade: ");
char grade = scan.next().charAt(0);
 
		
		switch(grade) {
		case 'A':
			System.out.println("pass");
			break;
		
		case 'B':
			System.out.println("pass");
			break;
		
		case 'C':
			System.out.println("pass");
			break;
		
		case 'D':
			System.out.println("fail");
			break;
		
		
		case 'E':
			System.out.println("fail");
			break;
		
		default: 
			System.out.println("Invalid grade");
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
