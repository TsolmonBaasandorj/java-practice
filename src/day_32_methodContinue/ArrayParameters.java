package day_32_methodContinue;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayParameters {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		int[] num=new int[3];
//		for(int i=0; i<num.length; i++) {
//			num[i]=scan.nextInt();
//		}
//    printArray(num);
   // printArray(new int[] {12,34,56});
    
    int[] arr= {1, 2, 3, 4, 5};
    int[] arr2= {1,2};
  
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter size1: ");
   int size = scan.nextInt();
  
   int[] newArr=new int[size];
   for(int i=0; i<newArr.length; i++) {
	   System.out.println("Enter num: "+ (i+1));
	   newArr[i]=scan.nextInt();
   }
   
   System.out.println("Enter size2: ");
   int size2=scan.nextInt();
   
   int[] newArr2=new int[size2];
   for(int i=0; i<newArr2.length; i++) {
	   System.out.println("Enter num: "+ (i+1));
	   newArr2[i]=scan.nextInt();
   }
    print2Arrays(newArr, newArr2);
    int[] arr3= {1,2,3};
	int[] arr4= {1,2};
	print2ArraysV2(arr3,arr4);
	
	}
public static void printArray(int[] arr) {
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
}
public static void print2Arrays(int[] arr, int[] arr2) {
	
	if(arr.length>arr2.length) {
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}else {
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr));
	}
	
}
public static void print2ArraysV2(int[] arr, int[] arr2) {
	
	if(arr.length>arr2.length) {
		printArray(arr);
		printArray(arr2);
	}else {
		printArray(arr2);
		printArray(arr);
	}
}
}
