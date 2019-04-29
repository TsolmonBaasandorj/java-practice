package day19_Loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
// Scanner scan = new Scanner(System.in);
// Random random = new Random();
// System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
// 
// int secretNumber=random.nextInt(101);
// int number;
// do {
//	 System.out.println("Guess A number: ");
//	    number = scan.nextInt();
//	 if(number<secretNumber) 
//		 System.out.println("Number is too small!");
//	 if(number>secretNumber) 
//		 System.out.println("Number is too big!");
//	 
// }while(number!=secretNumber);
//
// System.out.println("Bingo, Congratulations, you won!");
		
		int[] arr=new int[] {7, 0, 4, 3, 0, 1};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(zeroMax(arr)));
	
	}
	
	
	public static int[] zeroMax(int[] nums) {
		List<Integer> list=new ArrayList<>();
		for(int k=0; k<nums.length; k++) {
			list.add(nums[k]);
		}
		  int temp=0;
		int[] newArr = nums;
		for(int i=nums.length-1; i>=0; i--){
		  if(nums[i]%2==1 && nums[i]!=0 && nums[i]>temp){
		    temp=nums[i];
		    newArr[i]=nums[i];
		    for(int j=0; j<i; j++){
		      if(list.get(j)==0){
		       newArr[j]=temp;
		      }else {newArr[j]=nums[j];}
		    }
		    
		  }else
		  newArr[i]=nums[i];
		  
		}
		 return newArr;

		} 

}
