package day11_logical_nestedif;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username:");
		String username = scan.nextLine();
		System.out.println("Enter password:");
		String password = scan.nextLine();
		
		String validUsername = "Tsolmon";
		String validPassword = "Tsoomoo93";
		 
		if(username.equalsIgnoreCase(validUsername) && password.equalsIgnoreCase(validPassword)) {
			System.out.println("Login Successful, Welcome!");
	    }else if(!username.equalsIgnoreCase(validUsername) && !password.equalsIgnoreCase(validPassword)) {
			System.out.println("Invalid Username and Invalid Password");
		}else if(!username.equalsIgnoreCase(validUsername) && password.equalsIgnoreCase(validPassword)) {
			System.out.println("Username is wrong!");
		}else if(username.equalsIgnoreCase(validUsername) && !password.equalsIgnoreCase(validPassword)) {
			System.out.println("Password is wrong!");
		}	
	}
}
