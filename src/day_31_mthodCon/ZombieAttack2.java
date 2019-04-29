package day_31_mthodCon;

import java.util.*;

public class ZombieAttack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] inhabitants = {1,2,3,4,5,6,7,8};
//		if(containsN(inhabitants,0)) {
//		int sum=sum(inhabitants);
//		List<Integer> list = new ArrayList<>();
//		System.out.println(Arrays.toString(inhabitants));
//		while(sum>0) {
//			for(int i=0; i<inhabitants.length; i++) {
//				if(checkZero(inhabitants, i)) {
//					list.add(i);
//				}
//			}
//			
//			for(int j=0; j<list.size(); j++) {
//				inhabitants[list.get(j)]=inhabitants[list.get(j)]/2;
//			}
//			list.clear();
//			
//			System.out.println(Arrays.toString(inhabitants));
//			sum=sum(inhabitants);
//			
//		
//		}
//
//		} else {	System.out.println("There is no Zero!");}
//	}
///** 
// * This method takes int array and calculates the sum of all the items and returns the total as an int
// * 
// * @author Khaliunaa
// * @param int[]
// * @return int
// */
//	public static int sum(int[] arr) {
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//		}
//		return sum;
//	}
//
//	/**
//	 * This method takes int[] and also one index of the array and checks if any of the neighbor item equals to 0 
//	 * 
//	 * author Tsolmon
//	 * @param int[]
//	 * @param int index
//	 * @return boolean
//	 */
//	public static boolean checkZero(int[] arr, int index) {
//		if (index == 0) {
//			if (arr[1] == 0) {
//				return true;
//			}
//		} else if (index == arr.length - 1) {
//			if (arr[arr.length - 2] == 0) {
//				return true;
//			}
//		} else {
//			if (arr[index - 1] == 0 || arr[index + 1] == 0) {
//				return true;
//			}
//
//		}
//
//		return false;
//
//	}
//	
//	public static boolean containsN(int[] arr, int n) {
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]==n) {
//				return true;
//			}
//		}
//		return false;
//		
		
		
		
		int[] inhabitants={0,0,0,0,5,6,7,8};
		if(containsN(inhabitants,0)) {
		int sum=sum(inhabitants);
		
		System.out.println(Arrays.toString(inhabitants));
		List<Integer> list = new ArrayList<>();
		while(sum>0) {
			for(int i=0; i<inhabitants.length; i++) {
				if(checkZero(inhabitants, i)) {
					list.add(i);
				}
			}
			
			for(int j=0; j<list.size(); j++) {
				inhabitants[list.get(j)]=inhabitants[list.get(j)]/2;
			}
			System.out.println(Arrays.toString(inhabitants));
			list.clear();
			sum=sum(inhabitants);}
		}else {
		System.out.println("There is no Zero!!!");}
		}
		
	public static int sum(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
		
	}
	
	public static boolean checkZero(int[] arr, int index) {
		if(index==0) {
			if(arr[1]==0) {
				return true;
			}
		}else if(index==arr.length-1) {
			if(arr[arr.length-2]==0) {
				return true;
				
			}
		}
		
		else {
			if(arr[index-1]==0 || arr[index+1]==0) {
				return true;
			}
			
		}
		return false;
	}
	public static boolean containsN(int[] arr, int n) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
				return true;
			}
		}
		return false;
	
	}
		
	
}
