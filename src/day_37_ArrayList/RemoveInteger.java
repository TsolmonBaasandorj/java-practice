package day_37_ArrayList;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> nums = new ArrayList<>();
System.out.println(nums.size());
System.out.println(nums.isEmpty());
System.out.println(nums.size() == 0);

nums.add(4);
nums.add(1);
nums.add(443);
nums.add(5);
nums.add(10);
nums.add(100);
nums.add(55);

Integer n1=new Integer(5);
Integer n2=new Integer(55);

nums.remove(n1);
nums.remove(n2);
System.out.println(nums);
	}

}
