package day22_ReCap;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
int month;
		do {
			System.out.println("Enter month: ");
			month=scan.nextInt();
			month++;
			}while(month>1 && month<=12);
		
		System.out.println("Invalid month -" + month);
		
	}
	
}
