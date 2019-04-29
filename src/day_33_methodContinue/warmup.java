package day_33_methodContinue;

import java.util.Scanner;

public class warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scan = new Scanner(System.in);
//		int num1=scan.nextInt();
//		int num2=scan.nextInt();
		
//addVoid(num1, num2);
//System.out.println("Sum: "+add(10,30));
//int result = add(2,3);
//System.out.println("Result: "+result);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers to be multiplied: ");
		int n=scan.nextInt();
		int n2=scan.nextInt();
		System.out.println("Enter 2 numbers to be abstructed: ");
		int n3=scan.nextInt();
		int n4=scan.nextInt();
		System.out.println("Enter 2 numbers to be divided: ");
		int n5=scan.nextInt();
		int n6=scan.nextInt();

int resultMultiply=multiply(n,n2);
System.out.println("Result multiply: "+ resultMultiply);
int resultMinus=minus(n3,n4);
System.out.println("Result minus: "+ resultMinus);
double resultDivision=divide(n5,n6);
System.out.println("Result division: "+ resultDivision);
	}
public static void addVoid(int num1, int num2) {
	int sum=num1+num2;
	System.out.println("Sum: "+sum);
}public static int add(int num1, int num2) {
	int sum2=num1+num2;
	//System.out.println("Sum: "+sum2);
	return sum2;
}
public static int multiply(int n1, int n2) {
	int sum=n1*n2;
	return sum;
}
public static int minus(int n1, int n2) {
	int sum=n1-n2;
	return sum;
}
public static double divide(int n1, int n2) {
	if(n2==0) {
		System.out.println("Number can not / by 0!");
		System.exit(0);
	}
	int sum = n1/n2;
	return sum;
}

}
