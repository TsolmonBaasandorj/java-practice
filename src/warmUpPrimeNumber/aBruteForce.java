package warmUpPrimeNumber;

import java.util.Scanner;

public class aBruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int attemp=5;
		String expecteduserName = "tsolmon";
		String expectedpassword = "tsolmon123";
		String userName="";
		String password="";
do {
	
	if(attemp ==0) {
		System.out.println("You have exceeded number or attemps.");
		System.out.println("This user has been deactivated .");
		return;
	}
	attemp--;
	System.out.println("Enter username:");
	userName = scan.next();
	if(!userName.equals(expecteduserName)) {
		System.out.println("Wrong username");
		System.out.println("Attemps left: " + attemp);
		continue;
	}
	System.out.println("Enter password:");
	password = scan.next();
	if(!password.equals(expectedpassword)) {
		System.out.println("Wrong password");
		System.out.println("Attemps left: " + attemp);
		continue;
	}
	
	
}while(!password.equals(expectedpassword) || !userName.equals(expecteduserName));
System.out.println("Login seccessful!");
	}

}
