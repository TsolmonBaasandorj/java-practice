package day_27_mArray;
import java.util.*;
public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] nums= {43, 12, 4, 1, 3, 5};
  System.out.println(Arrays.toString(nums));
  String str = Arrays.toString(nums);
  System.out.println(str);
  
  Arrays.sort(nums);
  System.out.println(Arrays.toString(nums));
  
  String[] languages= {"Zulu", "Spanish", "Italian", "English", "Polish", "mongolian", "arabic"};
  // numbers--> UPPERCASE--> lowercase
  // 1 2 3 A B C a b c
  Arrays.sort(languages);
  System.out.println(Arrays.toString(languages));
  
  
  
  int[] nums2= {345, 665, 3333, 11, 3, 66};
  
  Arrays.sort(nums2);
  System.out.println(nums2[0]);
  System.out.println(nums2[5]);
  
  
  
  
  
  
  
  
  
	}

}
