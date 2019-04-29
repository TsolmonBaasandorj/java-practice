package day_31_mthodCon;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter num1:");
double num1=scan.nextDouble();
System.out.println("Enter num2");
double num2=scan.nextDouble();
add(num1,num2);
divide(num1,num2);
multiply(num1,num2);
remainder(num1,num2);
subtract(num1,num2);
	}
	public static void add(double num1, double num2) {
		double result=num1+num2;
		    System.out.println("Add result: "+result);
	}public static void divide(double num1, double num2) {
		if(num2==0) {
			System.out.println("Invalid Value!");
			return;}
		double result=num1/num2;
		    System.out.println("Division result: "+result);
    }public static void multiply(double num1, double num2) {
	    double result=num1*num2;
	        System.out.println("Multiply result: "+result);
    }public static void remainder(double num1, double num2) {
	    double result=num1%num2;
	        System.out.println("Remainder result: "+result);
    }public static void subtract(double num1, double num2) {
	    double result=num1-num2;
	        System.out.println("Subtract result: "+result);
}
}