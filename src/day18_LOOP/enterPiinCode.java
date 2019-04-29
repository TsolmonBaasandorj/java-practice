package day18_LOOP;

import java.util.Scanner;

public class enterPiinCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int secretPinCode=1234;
int pincode=0;
while(pincode!=secretPinCode) {
	System.out.println("Enter correct pin code!");
	pincode = scan.nextInt();
}
System.out.println("Access granted, select operation!");
		
		
	}

}
