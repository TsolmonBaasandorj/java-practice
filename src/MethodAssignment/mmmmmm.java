package MethodAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class mmmmmm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Scanner input = new Scanner(System.in);
//		    float[] score = new float[7];
//		    //WRITE YOUR CODE HERE
//		    float total=0;
//		   float min=100;
//		   float max=0;
//		    for(int i=0; i<score.length; i++){
//		    	System.out.println("Enter score for judge "+(i+1)+":");
//		    	score[i]=input.nextFloat();
//		        
//		    	 
//		    	if(score[i]<min) {
//		    		min=score[i];
//		    		System.out.println("min: "+min);
//		    		
//		    
//		    	
//		    	}if(score[i]>max) {
//		    			max=score[i];
//		    		
//		    		System.out.println("max: "+max);}}
//		    
//		    	
//		    	for(int i=0; i<score.length; i++) {
//		    	if(score[i]!=min && score[i]!=max) {
//		    	total=total+score[i];}
//		      
//		    	}
//		    System.out.println("total: "+total);
//
//		    System.out.println("Enter difficulty:");
//		    float difficulty = input.nextFloat();
//		    total= total*difficulty;
//		    total=(float) (total*0.6); //5,3,8,7,6,5,4 (3.6)  82.08
//		    // FINAL OUTPUT
//		    System.out.println("Total: "+total);
		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i = 0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    //WRITE YOUR CODE HERE
		   int temp=nums[0];
		   for(int i=0; i<nums.length-1; i++){
			   System.out.println(Arrays.toString(nums));
		     nums[i]=nums[i+1];
		    
		   }
		   System.out.println(Arrays.toString(nums));
		   nums[nums.length-1]=temp;
		     
				
				
		    
		   
		    System.out.println(Arrays.toString(nums));
	}}
//if(score[i]!=1 && score[i]!=9){
//total= total+ score[i];
//}