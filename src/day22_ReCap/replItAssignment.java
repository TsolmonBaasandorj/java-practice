package day22_ReCap;

import java.util.Scanner;

public class replItAssignment {

	public static void main(String[] args) {
		
			 
//		for(int i=0; i<10; i++) {
//			if(i%2!=0) {
//				continue;
//			}
//			System.out.println("Even numbers: "+ i);
//		}
			    
//			int i=0;
//			while(i<5) {
//				i++;
//			int j=0;
//			while(j<3) {
//				j++;
//				System.out.println(" IRow" + i + "-Column"+j);
//			}
//			System.out.println();
//			}
			  
			
//			for(int r=0; r<2; r++) {
//				System.out.println();
//				for(int k=0; k<3; k++) {
//					System.out.print("IRow" + r +"-Column"+k);
//				}
//			
//			}
		
		
		int[] cols= {1,2,3};
		int[] rows= {1,2,3,4};
		
		for(int row : rows) {
				System.out.println();
				for(int column : cols) {
					System.out.print("row "+ row +"Column " + column);
				}
			}
			
		System.out.println();
		int i=0;
		while(i<5) {
			i++;
			System.out.println();
			int col=0;
			while(col<5) {
				col++;
				System.out.print("Row "+i+"-Column "+col);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
	}

}