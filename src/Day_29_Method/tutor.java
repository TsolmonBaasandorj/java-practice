package Day_29_Method;
import java.util.*;
public class tutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(0);
		list.add(-1);
		list.add(-2);
		list.add(4);
		System.out.println(appendPosSum(list));
	}
	public static List <Integer> appendPosSum(ArrayList <Integer> kudacha){
	      List <Integer> nums = new ArrayList<>();
	      int sum=0;
	      
	      for (int i =0; i < kudacha.size(); i++) {
	        if(kudacha.get(i) > 0) {
	          nums.add(kudacha.get(i));
	          sum += kudacha.get(i);
	        }
	      
	        }
	      nums.add(sum);
	      
	      return nums;
}
}
