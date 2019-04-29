package day_27_mArray;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums1= {4,5,6,10,100};
int[] nums2= {4,5,6,10,100};
//System.out.println(Arrays.equals(nums1, nums2));

if(Arrays.equals(nums1,nums2)) {
	System.out.println("They are exactly the same");
}else 
	System.out.println("Mismatched values present");


String[] strArr1= {"One", "Two", "Three"};
String[] strArr2= {"One", "Two", "Three"};
System.out.println(Arrays.deepEquals(strArr1,  strArr2));

boolean match= Arrays.equals(strArr1, strArr2);
System.out.println("match: "+match);




int[] num= {2,3,4};







	}

}
