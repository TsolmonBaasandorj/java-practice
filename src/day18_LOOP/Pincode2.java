package day18_LOOP;

import java.util.Scanner;

public class Pincode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int secretPinCode=4321;
int pin=0;
int attemps=0;
while(pin!=secretPinCode && attemps<=3) {
	System.out.println("Enter correct pin:");
	pin=scan.nextInt();
    attemps++;
    if(attemps==3 && pin!=secretPinCode) {
    	System.out.println("Card is blocked!!!!");
    	return;}

}
System.out.println("Access granted, select operation!");




 





	}

}