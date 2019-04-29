package day24_Array;

import java.util.Arrays;

public class firstArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		String[] names= {"Adam", "John", "Sarah"};
		for(int i=0; i<names.length;i++) {
			if(names[i].equals("John")) {
				System.out.println("Yes there is John!");
			}
		}
		
		
		
		int[] numbers2 = new int[3];
		numbers2[0]=5;
		numbers2[1]=100;
		numbers2[2]=20;
		
		System.out.println(Arrays.toString(numbers2));
		
		int sum=0;
		
		for(int i=0; i<numbers2.length;i++) {
			sum=sum+numbers2[i];
		}
		System.out.println("The sum of three numbers: "+sum);
		
		int max=0;
		int min=numbers2[0];
		for(int i=0; i<numbers2.length;i++) {
			if(numbers2[i]>max) {
				max=numbers2[i];
			}
		if(numbers2[i]<min) {
			min=numbers2[i];
		}
			
		}
		System.out.println("Max value is: "+max);
		System.out.println("Min value is: "+min);
		

	}

}
