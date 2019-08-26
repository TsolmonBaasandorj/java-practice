package day_42_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class callingCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Coffee n = new Coffee();
n.name="Latte";
n.size="Grande";
n.calories=180;
n.price=4.75;
System.out.println(n.getCoffeeInfo());
n.setName("Machiato","Tall",3,500);
System.out.println(n.getCoffeeInfo());

Coffee n2= new Coffee();
n2.setName2("Frappucinno");
n2.setSize("jkjk");
n2.price=4.5;
n2.calories=350;
System.out.println(n2.getCoffeeInfo());

//SETTER method will help assign value to instance variable.
//Another usage of setter help us to check if value is valid
Coffee n3 = new Coffee();
n3.setName("FLAT WHITE","TALL",3.95, 170);
System.out.println(n3.getCoffeeInfo());

int[] nums= {0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
countClumps(nums);
	}
	public static void countClumps(int[] nums) {
//	ArrayList<Integer> list = new ArrayList<>();
//	  for(int i=0; i<nums.length; i++){
//	    if(!list.contains(nums[i])){
//	      list.add(nums[i]);
//	    }
//	  }
//	  System.out.println(list);
//	  System.out.println(Arrays.toString(nums));
  int maxCount=0;
//	  //1,2,3,4
//	  //1,2,2,3,4,4
//	  int count=0;
//	  for(int i=0; i<list.size(); i++){
         int		  count=0;
	    for(int k=0; k<nums.length-2; k++){
	      if(nums[k]==nums[k+1]&& nums[k]!=nums[k+2]){
	        count++;
	      }
	      
	    }
	    
	  System.out.println(count);

	}
}
