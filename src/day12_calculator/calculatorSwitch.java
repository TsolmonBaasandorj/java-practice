package day12_calculator;

import java.util.Scanner;

public class calculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		
		double num1 = scan.nextDouble();
		 
		System.out.println("Enter second number:");
		
		double num2 = scan.nextDouble();
		 
		System.out.println("Select operator: +, -, *, /, %");
		String operator = scan.next();
		 
		 switch(operator) {
		 
		 case ("+"):
			 System.out.println("result: " +(num1+num2));
		    break;
		 case ("-"):
			 System.out.println("result: " +(num1-num2));
		    break;
		 case ("*"):
			 System.out.println("result: " +(num1*num2));
		    break;
		 case ("/"):
			 System.out.println("result: " + (num1/num2));
		    break;
		 case ("%"):
			 System.out.println("result: " + (num1%num2));
		    break;
		 default:
			 System.out.println("impossible");
		 
		 }
		 
		 
	}

}
