package day13_terNary_string_intro;

import java.util.Arrays;

public class FirstArray {

	public static void main(String[] args) {
		
		
//===========Creating array in 2 ways
		
	    int[] arr1= {2,3}; //inserted items during the declaration
	    
		int[] arr2=new int[2]; //created 2 bucket array without any items
		
		
		
		
//==========printing array in 2 ways
		
		System.out.println(Arrays.toString(arr1)); //print option 1
		
		for(int i=0; i<arr1.length; i++) { //print option 2
			System.out.println(arr1[i]);   //
		}								   //
		
		
//============inserting items in the array
		arr1[0]=3;
		arr1[1]=4;
		
	arr2[0]=1;
	arr2[1]=5;

	System.out.println(Arrays.toString(arr2)); //print option 1
	
	String name="Hi java there java how are you Hi java there java how are you Hi java there java how are you Hi java there java how are you Hi java there java how are you?";
	String[] nameChar=name.split(" ");
	System.out.println(Arrays.toString(nameChar)); //print option 1
	
	int count=0;
	for(int i=0; i<nameChar.length; i++) {
		if(nameChar[i].equals("java")) {
			count++;
			
		}
		
	}
	System.out.println(count);
	
	}
	
	
	//reusabe method \=
	public static int countJava(String str) {
		String[] nameChar=str.split(" ");
		int count=0;
		for(int i=0; i<nameChar.length; i++) {
			if(nameChar[i].equals("java")) {
				count++;
				
			}
			
		}
		return count;
	}

}
