package day_31_mthodCon;

import java.util.Scanner;

public class CalculatorTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//calculator.add(2, 5);
//calculator.multiply(2, 5);
//calculator.remainder(6, 5);

Scanner scan = new Scanner(System.in);
System.out.println("Enter num 1:");
double num1=scan.nextDouble();
System.out.println("Enter num 2:");
double num2=scan.nextDouble();
System.out.println("Select operation: '+','-','*','/','%'");
String operator=scan.next();

switch(operator){
case  "+": 
	calculator.add(num1,num2);
	break;
case "-":
	calculator.subtract(num1,num2);
	break;
case "*":	
	calculator.multiply(num1,num2);
	break;
case "/":
	calculator.divide(num1,num2);
	break;
case "%":
	calculator.remainder(num1,num2);
	break;
default:
	System.out.println("Invalid Value");
	break;
	
}

	}

	
}
