package day_38_ArrayList;
import java.util.*;
public class ContainsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> nums1 = new ArrayList<>();
nums1.add(10);nums1.add(20);nums1.add(30);nums1.add(40);

List<Integer> nums2 = new ArrayList<>();
nums2.add(20);nums2.add(10);nums2.add(40);nums2.add(30);nums2.add(100);

if(nums1.containsAll(nums2)) {
	System.out.println("Nums1 containsAll nums2");
}else {
	System.out.println("Nums1 does not containsAll nums2");
}
System.out.println(nums1.containsAll(nums2));
System.out.println(nums1.get(0)==nums2.get(0));


boolean b = nums1.containsAll(nums2) && nums2.containsAll(nums1);

System.out.println(b);

List<String> planA = new ArrayList<>();
planA.add("java");planA.add("replit");
planA.add("ping pong");planA.add("food");
planA.add("run");planA.add("sleep");

List<String> planB = new ArrayList<>();
planB.add("food");
planB.add("run");
planB.add("sleep");
planB.add("java");
planB.add("ping pong");
planB.add("replit");

boolean merge= planA.containsAll(planB) && planB.containsAll(planA);
 
if(merge) {
	System.out.println("PlanA match planB");
}else
	System.out.println("PlanA does not match planB");







	}

}
