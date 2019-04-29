package day_27_mArray;

import java.util.Scanner;

public class warmUpTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] time1 = new int[2];
		int[] time2 = new int[2];

		time1[0] = 10;
		time1[1] = 15;

		time2[0] = 16;
		time2[1] = 20;

		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time1 has invalid hour!");
			return;
		}
		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time2 has invalid hour!");
			return;
		}

		if (time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time1 has invalid hour!");
			return;
		}
		if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time2 has invalid hour!");
			return;
		}

		
		
		if(time1[0]<time2[0]) {
			System.out.println("Time1 is earlier");
		}else if(time2[0]<time1[0]) {
			System.out.println("Time2 is earlier");
		}else {
			if(time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			}else if(time2[1]<time1[1]) {
				System.out.println("Time2 is earlier");
			}else {
				System.out.println("Equal times");
			}
			
		}
		
		
		
		
		String m="https://learn.cybertekschool.com/courses/144";
		
		
		String[] M=m.split("/");
		//int index=m.indexOf("144");
		for(String a: M) {
			a=a.substring(a.indexOf("144"));
			System.out.println(a);
		}
		
		
	}
}