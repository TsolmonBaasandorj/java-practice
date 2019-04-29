package day_31_mthodCon;

import java.util.Arrays;
import java.util.Scanner;

public class methodAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int[] nums= {2, 5, 5, 6, 3, 6, 9, 34, 3};
//		    printUniqueNumbers(nums);
//		  }
//		  
//		  public static void printUniqueNumbers(int[] nums){
//		    //WRITE YOUR CODE HERE
//		    int count=0;
//		    for(int j=0; j<nums.length; j++) {
//		    	count=0;
//		     for(int i=0; i<nums.length; i++){
//		      if(nums[j]==nums[i]) {
//		    	  count++;
//		      }
//		      
//		     
//		    }
//		     if(count==1) {
//		    	 System.out.println(nums[j]);
//		     }
//		    
//		    
//	}
//		   
//		    
		
//	String[] words = {"java, code, python, code, rust, code, rust"};
//	
//     printUniqueWords(words);
//	}
//	public static void printUniqueWords(String[] words){
//	    //WRITE YOUR CODE HERE
//		int count=0;
//		String str = Arrays.toString(words);
//		str=str.replace("[", "");
//		str=str.replace("]", "");
//		String[] newArr=str.split(", ");
//		
//		
//		System.out.println("NewArr: "+Arrays.toString(newArr));
//       
//		
//		for(int i=0; i<newArr.length; i++) {
//    	  count=0;
//    	   for(int j=0; j<newArr.length; j++) {
//    		   if(newArr[i].equals(newArr[j])) {
//    			   count++;
//    		   }
//    		  
//    	   }
//    	   if(count==1)
//    	   System.out.println(newArr[i]);
//    	   
//       }

//	int num=1234;
//	String reverse="";
//	boolean check=false;
//	String str = Integer.toString(num);
//
//	for(int i=str.length()-1; i>=0; i--) {
//		reverse=reverse+str.charAt(i);
//		
//	}
//	
//	if(str.equals(reverse)) {
//		check=true;
//	}
//	
//	
//	System.out.println(check);
	
	
	
		  Scanner scan = new Scanner(System.in);
		    String numStr = scan.next();
		    printDataTypes(numStr);
		  }
		  
		  public static void printDataTypes(String numStr){
		    long num = 0;
		    try{
		       num = Long.valueOf(numStr);
		       System.out.println(num+" can be fitted in:");
		       
		       if(num>=-128 && num<=127){
		            System.out.println("* byte");
		        }
		       if(num>=-32768 && num<=32767){
		            System.out.println("* short");
		      }
		       if(num>=-2147483648 && num<=2147483647){
		            System.out.println("* int");
		        
		      }
		        if(num>=-9223372036854775808L && num<=9223372036854775807L) {
		            System.out.println("* long");}
		        
		        //WRITE YOUR CODE HERE
		        
		        
		        //DO NOT CHANGE        
		    }catch(Exception e){
		       System.out.println(numStr+" can't be fitted anywhere.");
		    }
	
	
	
	
	
	
	
	
	
	
	}
	    
}
