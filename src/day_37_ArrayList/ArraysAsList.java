package day_37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare and add values in single statement
List<String> cars = Arrays.asList("Tesla","Porsch","Honda");
List<Integer> nums = Arrays.asList(1,2,3,4,5);
System.out.println(cars);
System.out.println(nums);
nums.set(0,100);
System.out.println(nums);
List<Integer> list = Arrays.asList(10,20);
System.out.println(list);

List<Double> prices=Arrays.asList(102.0,2.5,500.50,4.5,5.6,
		                           2.3,1.9,2.5,4.5,5.5);
System.out.println(prices);
double sum=0;
for(int i=0; i<prices.size(); i++) {
	sum=sum+prices.get(i);
}
System.out.println("Sum: "+sum);

List<Double> expensive = new ArrayList<>();

for(int i=0; i<prices.size(); i++) {
	if(prices.get(i)>100) {
		expensive.add(prices.get(i));
	}
}

System.out.println("Item in expensive: "+expensive);

System.out.println(prices);
	}

}
