package day18_LOOP;

import java.util.Scanner;

public class giveMe5dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int dollars=0;
while(dollars!=5) {
	System.out.println("Give me 5 Dollars");
	dollars = scan.nextInt();
}
System.out.println("Thank you for 5 dollars!");
	}

}
 