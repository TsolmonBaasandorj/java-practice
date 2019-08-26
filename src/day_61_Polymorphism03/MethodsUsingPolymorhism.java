package day_61_Polymorphism03;
import java.util.Scanner;

import day_40_Class.Employee;
import day_43_encapsulation.Tesla;
import day_49_inheritance02.TV;
import day_60_Polymorphism02.*;
public class MethodsUsingPolymorhism {
	public static void main(String[] args) {
		buildDevice("mac");
		returnApp();
		Mac mac = new Mac();
		
		purchase(mac);
		purchase(new AppleWatch());
		purchase(new Ipad());
		
		giveMeAnyObject(new String());
		giveMeAnyObject(new Scanner(System.in));
		giveMeAnyObject(new TV());
		giveMeAnyObject(new Tesla());
		giveMeAnyObject(new Employee());
		giveMeAnyObject(55);// its auto boxing to Integer
		giveMeAnyObject(22.2);
		
	}

	public static void purchase(AppleDevice ap) {
		System.out.println("Purchasing: "+ap.getClass().getSimpleName());
	}
	public static void giveMeAnyObject(Object object) {
		System.out.println("You gave me: "+object.getClass().getSimpleName());
		
	}
	public static AppleDevice returnApp() {
//	  AppleDevice n = new Ipad();
//	  return n;
	  return new AppleWatch();
	}
	
	
	public static AppleDevice buildDevice(String type) {
		if(type.equals("ipad")) {
			return new Ipad();
		}
		else if(type.equals("applewatch")) {
			return new AppleWatch();
		}else if(type.equals("mac")) {
			return new Mac();
		}else
			return null;
	}
	
	
	
	
}
