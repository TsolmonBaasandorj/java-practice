package MethodAssignment;

import java.util.Arrays;

public class shiftLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] nums= {1,1,2,2,4};
int temp=nums[0];
//nums[0]=nums[1];
//nums[1]=nums[2];
//nums[2]=nums[3];
//nums[3]=nums[4];
//nums[4]=temp;
 
for(int i=0; i<nums.length-2; i++){
	temp=nums[i];
	nums[i]=nums[i];
	nums[nums.length-1]=temp;
}
System.out.println(Arrays.toString(nums));
	}

}
