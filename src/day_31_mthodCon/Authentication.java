package day_31_mthodCon;

import java.util.Scanner;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter your username:");
String username=scan.next();
System.out.println("Enter your password:");
String password=scan.next();
login(username, password);
	}
public static void login(String username, String password) {
	String Secretusername="Tsoomoo93";
	String Secretpassword="Tsoomoo";
	if(username.equals(Secretusername)&&password.equals(Secretpassword)) {
		System.out.println("Login Successful! Welcome Okta!");
	}else {
		System.out.println("Wrond Username or Password!");
	}
}
}
