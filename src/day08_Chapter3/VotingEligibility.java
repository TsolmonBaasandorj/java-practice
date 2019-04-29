package day08_Chapter3;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("How old are you? ");
int age = scan.nextInt();
int VotingAge=18;
int difference = age-18;
int difference2 = 18-age;
if(age>=18) {
	System.out.println("You are eligible to vote.");
	System.out.println("You have been eligible for " +difference+ " years!");
}else {
	System.out.println("You are not eligible to vote.");
	System.out.println("You still have " + difference2 + " years to go!");
}
	}

}
