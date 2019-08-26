package OCA_Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class QUIZ {

	public static void main(String[] args) {
		String[] a= {"apple","pear"};
		System.out.println(Arrays.toString(reverse(a)));
		}
	public static String[] reverse(String[] arr) {
		
		String [] r = new String[arr.length];
	   
		int i=0;
	    
	    for(int k=arr.length-1; k>=0;k--) {
	     r[i]=arr[k];
	     i++;
	   }
	    
	    
	     return r;
	}
}
