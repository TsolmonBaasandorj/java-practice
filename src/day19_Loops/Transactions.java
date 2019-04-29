package day19_Loops;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

//System.out.println("What is your current balance");
//double balance =scan.nextDouble();
//
//while(balance>0) {
//	System.out.println("What is transaction amount:");
//	double transaction=scan.nextDouble();
//	balance=balance-transaction;
//	System.out.println("Your new balance: " + balance);
//  }
//System.out.println("You have insufficient funds, your balance: " + balance);


	int count=0;
	System.out.println("What is your current balance");
	int balance=scan.nextInt();
	
	while(balance>0) {
		count++;
		System.out.println("What is transction #" + count + ":");
		int transaction = scan.nextInt();
		
		  if(transaction>balance) {
			System.out.println("Your balance is about to be negative!");}
		
		    balance=balance-transaction;
		
		    System.out.println("Your new balance is: " + balance);
		
	}
	
	System.out.println("Your final balance is: " + balance);
	System.out.println("count: " + count);
	
	
	
	
	
	}

}
