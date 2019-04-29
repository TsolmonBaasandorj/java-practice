package day13_terNary_string_intro;

import java.util.Scanner;

public class CarSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
	
	      int averagePrice=0;
	     
	     double startingPrice;
		String carOptions="";
		String carOrigin="";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Which type of car are you interested: ");
		
		System.out.println("1)American\n2)Japanese\n3)German\n4)Italian\n5)Korean");
		
		int carTypes = scan.nextInt();
		
		switch(carTypes) {
		
		case 1:
			
			averagePrice = 33000;
			carOrigin = "American:";
			carOptions = ("Ford, Dodge, Tesla, Chevrolet, Lincoln");
			
			break;
		
		case 2:
			averagePrice = 32000;
			carOrigin = "Japenese:";
		    carOptions= ("Toyota, Mitsubisi, Honda, Subaru, Mazda");
		
			break;
		case 3: 
			averagePrice = 55000;
			carOrigin = "German:";
			carOptions = ("Bmw, VW, Audi, Mercedes, Porsche");
			break;
			
		case 4:
			   averagePrice = 85000;
			   carOrigin = "Italian:";
			  carOptions =("Italian: Alfa Romeo, Ferrari, Lamborghini, Fiat");
			 break;
			
			
		case 5:
			  averagePrice = 25000;
			  carOrigin = "Korean:";
			carOptions= ("Korean: Kia, Hyundai, Daewoo");
			
			
			
			break;
			
		
		default:
			System.out.println("Car type is not available!!!");
			return;
		
		}	
			System.out.println("You selected " + carOrigin + " " +  carOptions + " Average price: " + averagePrice);
			
			
			
			
		
		
		
		
		
	}

}
