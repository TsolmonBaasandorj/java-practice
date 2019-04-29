package day_34_methodContinue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter array size: ");
//		int size = scan.nextInt();
//		int[] arr = new int[size];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Enter value in array: " + (i + 1));
//			arr[i] = scan.nextInt();
//		}
//
//		System.out.println("Enter n: ");
//		int n = scan.nextInt();
//
//		System.out.println("count of n: " + findOccurrence(arr, n));
		
		System.out.println(Arrays.toString(getArray()));
		System.out.println(Arrays.toString(getRandomArray(9)));
	
	}

	public static int findOccurrence(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				count++;
			}
		}
		return count;

	}
	
	public static int[] getArray() {
		int[] newArr= {1,2,3,4,5,6,7,8};
		
		return newArr ;
		
	}
	
	public static int[] getRandomArray(int size) {
		int[] arr=new int[size];
		Random rand = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i]=rand.nextInt(11);
		}
		return arr;
		
	}

}
