package day09_String;

import java.util.Scanner;

public class Citizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seniorCitizens, nonSeniorCitizens,age;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
	    seniorCitizens = scan.nextInt();
	    nonSeniorCitizens = scan.nextInt();
	    System.out.println("What is new citizen's age?");
	    age = scan.nextInt();
	    if(age>=65){
	      System.out.println("Senior Citizen" );
	      seniorCitizens =seniorCitizens+1;
	    }if (age<65){
	      System.out.println("Non-Senior Citizen" );
	      nonSeniorCitizens=nonSeniorCitizens+1;
	    }
	    
	    System.out.println("New seniorCitizens count " + seniorCitizens);
	    System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
	    
	    
	}

}
