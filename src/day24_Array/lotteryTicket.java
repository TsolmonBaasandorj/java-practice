package day24_Array;

import java.util.Arrays;

public class lotteryTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] lotteryNumbers = {12,45,3,62,42,90};
System.out.println(Arrays.toString(lotteryNumbers));

Arrays.sort(lotteryNumbers);
System.out.println(Arrays.toString(lotteryNumbers));

int index = Arrays.binarySearch(lotteryNumbers, 90);
System.out.println("Position: "+index);

int index2=Arrays.binarySearch(lotteryNumbers, 5);
System.out.println(index2);





	}

}
