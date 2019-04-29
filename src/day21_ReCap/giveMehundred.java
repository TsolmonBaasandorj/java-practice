package day21_ReCap;

import java.util.Scanner;

public class giveMehundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		
		int sum=0;
	
	do {
		   System.out.println("Enter two integers: ");
		   int number1=scan.nextInt();
		   int number2=scan.nextInt();
		   sum=number1+number2;
		   
	   }while(sum<100);
	
	System.out.println("Good numbers!");



	
	
	
	
	
	
	}

}
