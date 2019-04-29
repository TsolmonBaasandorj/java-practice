package day_27_mArray;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num= {4,5,6,7,8,10};
System.out.println(Arrays.binarySearch(num, 7));

int i=Arrays.binarySearch(num,10);
System.out.println(i);

int[] num2 = {40, 6, 17, 40, 10, 55};
Arrays.parallelSort(num2);
Arrays.binarySearch(num2, 6);
System.out.println(Arrays.toString(num2));
System.out.println(Arrays.binarySearch(num2, 40));

	}

}
