package day_36_WrapperClass;

import java.util.*;

class Main {
	
	  
	  public static void main(String[] args){
		 
	    int[] nums={1,2,3,4,5};
	    double[] nums2= {1.1, 3.3, 4.4};
	    
	    System.out.println(findMaxInt(nums));
	    System.out.println(findMaxDouble(nums2));
	  }
	  public static int findMaxInt(int[] arr){
	    int max=0;
	    for(int i=0; i<arr.length; i++){
	      if(arr[i]>max){
	        max=arr[i];
	      }
	    }
	    return max;
	  }
	   public static double findMaxDouble(double[] num){
	     double max=0.0;
	     for(int i=0; i<num.length; i++){
	      if(num[i]>max){
	        max=num[i];
	      }
	     }
	     return max;
	   }
	}

