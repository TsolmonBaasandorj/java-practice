package day24_Array;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String[] cars = {"BMW", "Audo","Ford","Honda","Mercedes","Mercury","Rolls-Royce","Tesla"};
     for(String car: cars) {
    	 if(car.startsWith("M")) {
    		 System.out.println(car);
    	 }
    	 System.out.println("************");
    for(String car2: cars) {
    	if(car2.toLowerCase().contains("r")) {
    		System.out.println(car2);
    	}
    	
    }
    System.out.println("*************");
    for(String car3: cars) {
    	if(car3.charAt(car3.length()-1)=='a') {
    		System.out.println(car3);
    	}
    }
    System.out.println("*************");
    	 for(String car4: cars) {
    		 if(car4.length()>=6) {
    			 System.out.println(car4);
    		 }
    	 }
    	 
    	 String temp=cars[0];
    	 for(int i=0; i<cars.length;i++) {
    		 
    		 temp=cars[cars.length-1];    //temp=tesla
    		 cars[cars.length-1]=cars[0];//tesla=bmw
    		 
    		 cars[0]=temp;             //bmw=tesla
    		 
    		
    		 
    		 System.out.print(Arrays.toString(cars));
    		 
    		 
    	 }
    	 System.out.println("************************");
    	 //Arrays.sort method sort values in alphabet order* a-z
    	 Arrays.sort(cars);
		 System.out.println(Arrays.toString(cars));
    	 
    	 
		 System.out.println("The position for Ford: "+ Arrays.binarySearch(cars, "Ford"));
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
	}

}
