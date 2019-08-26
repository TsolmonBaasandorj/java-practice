package day_39_ArrayList;
import java.util.*;
public class UniqueValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> nums = new ArrayList<>();
nums.add(10);nums.add(10);nums.add(7);nums.add(8);
nums.add(8);nums.add(3);nums.add(4);nums.add(8);


List<Integer> unique = new ArrayList<>();
int count=0;
for(int i=0; i<nums.size(); i++) {
	count=0;
	for(int j=0; j<nums.size(); j++) {
		if(nums.get(i)==nums.get(j)) {
			count++;
		}
	}
	if(count==1) {
		unique.add(nums.get(i));
	}
}
System.out.println(unique);

for(int i=0; i<nums.size(); i++) {
	if(!unique.contains(nums.get(i))) {
		unique.add(nums.get(i));
	}
}
System.out.println(unique);

	}

}
