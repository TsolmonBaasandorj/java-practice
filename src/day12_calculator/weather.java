package day12_calculator;

import java.util.Scanner;

public class weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String weather;
		Scanner scan = new Scanner(System.in);
		System.out.println("How is weather? ");
		weather = scan.next();
		
		switch(weather) {
		
		case ("sunny") :
			System.out.println(" Go to Park \n Code Java");
		     break;
		case ("hot") :
			System.out.println(" Go Swimming \n Code Java");
		     break;
		case ("windy") :
			System.out.println(" Fly a kite \n Code Java");
		     break;
		case ("rainy") :
			System.out.println(" Go shopping \n Code Java");
		     break;
		case ("snowy") :
			System.out.println(" Chain your tyres \n Go skiing \n Code Java");
		     break;
		 default:
			 System.out.println("Code Java!");
		}
		
		System.out.println("### END OF PROGRAM ###");
		
	}

}
