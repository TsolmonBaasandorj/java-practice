package day_35_practice;

import java.util.*;

public class practice {

	static public void main(String...strings ) {

		int[] arr= {7,4,1,4,0,1,5,9,9,3};
//	for(int i = 0; i < nums.length; i++) {
//			int temp = nums[i]; // get a number
//			int counter = 0;
//			//
//			for(int j = 0; j < nums.length; j++) {
//				if(nums[j] == temp && i != j) {
//					counter++;
//					break;
//				}

System.out.println("#1: "+Arrays.toString(uniqueArr(arr)));
//int count=0;
//
//for(int i=0; i<arr.length; i++) {
//	count=0;
//	for(int j=0; j<arr.length; j++) {
//		if(arr[i]==arr[j] && i!=j) {
//			count++;
//		}
//	}
//	if(count==0) {
//		System.out.println(arr[i]);
//	}
//}
	System.out.println("#2: "+unique(arr));
	}

	public static List<Integer> unique(int[] arr) {
		int count=0;

List<Integer> list=new ArrayList<>();
		
for(int i=0; i<arr.length; i++) {
			count=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				list.add(arr[i]);
			}
		}
			
		return list;
		
	}
	public static int[] uniqueArr(int[] nums) {
		int count=0;
		int uniqueCounter=0;
		
		for(int i=0; i<nums.length; i++) {
			count=0;
			for(int j=0; j<nums.length; j++) {
				if(nums[i]==nums[j] && i!=j) {
					count++;
				}
			}
			if(count==0) {
				
				uniqueCounter++;
			}
		}
		
		int[] newArray=new int[uniqueCounter];
		int idx=0;
		
		for(int i=0; i<nums.length; i++) {
			count=0;
			for(int j=0; j<nums.length; j++) {
				if(nums[i]==nums[j] && i!=j) {
					count++;
					break;
				}
			}
			if(count==0) {
				newArray[idx]=nums[i];
				idx++;
				
			}
		}
			
		return newArray;
	}
}
