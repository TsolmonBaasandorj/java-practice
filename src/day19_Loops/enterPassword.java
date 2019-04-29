package day19_Loops;

import java.util.Scanner;

public class enterPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
	    int inhabitants = scan.nextInt();
	    
	    int dayCount=0;
		    
		    while(inhabitants>0) {
		    	System.out.println("Day " + dayCount+ " ["+ inhabitants+"]");
		    	inhabitants = inhabitants/2;
		    	dayCount++;
		    	
		    }
		    System.out.println("----EXTINCT----");
		    
	}

}
