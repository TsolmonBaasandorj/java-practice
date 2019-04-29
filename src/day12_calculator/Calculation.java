package day12_calculator;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		
		double num1 = scan.nextDouble();
		 
        System.out.println("Enter second number:");
		
		double num2 = scan.nextDouble();
		 System.out.println("Select operator: +, -, *, /, %");
		 String operator = scan.next();
		 
		 //perform calculation and display result.
		 if(operator.contentEquals("+")) {
			 System.out.println("result: " + num1+num2);
		 }if(operator.contentEquals("-")) {
		 
			 System.out.println("result: " + (num1-num2));
		 
		 } if(operator.contentEquals("*")) {
				 System.out.println("result: " + (num1*num2));
		 
		 } if(operator.contentEquals("/")) {
					 System.out.println("result: " + (num1/num2));
		 
		 } if(operator.contentEquals("%")) {
	     System.out.println("result: " + (num1%num2));
	}
	}
}
