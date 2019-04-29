package day15_string;

import java.util.Scanner;

public class indexOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String list = "html-selenium-angular-jenkins-grid";
int firstDash= list.indexOf("-");
System.out.println("The first dash: " + firstDash);

int secondDash = list.indexOf("-", 5);
System.out.println("second dash:" + secondDash);
int thirdDash = list.indexOf("-",secondDash+1);
System.out.println(thirdDash);


	
	
	
	
	
	
	}
	
	
	

}
