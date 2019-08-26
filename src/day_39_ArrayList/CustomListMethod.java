package day_39_ArrayList;
import java.util.*;
public class CustomListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> n=new ArrayList<>();
n.add(100);n.add(200);n.add(300);
printList(n);
ArrayList<Double> n2=new ArrayList<>();
n2.add(10.2);n2.add(12.2);n2.add(3.2);n2.add(7.2);n2.add(8.2);n2.add(1.1);n2.add(8.2);
System.out.println("Sum of double: "+sumList(n2));
System.out.println(getList(20));
ArrayList<Integer> num=getList(20);
//System.out.println(num);
System.out.println(getRandList(10));
List<Integer> nums = getRandList(10);
Collections.sort(nums);
System.out.println(nums);
//printList(getRandList(7));
ArrayList<String> str=new ArrayList<>();
str.add("123");
str.add("999");
System.out.println(convertToIntList(str));

	}
public static void printList(List<Integer> list) {
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
}
public static double sumList(List<Double> num) {
	double sum=0;
	for(int i=0; i<num.size(); i++) {
		sum=sum+num.get(i);
	}
	
	
	return sum;
}

public static ArrayList<Integer> getList(int size) {
	ArrayList<Integer> list = new ArrayList<>();
	for(int i=1; i<=size; i++) {
		list.add(i);
	}
	return list;
}

public static List<Integer> getRandList(int size){
	List<Integer> list = new ArrayList<>();
	Random r = new Random();
	for(int i=1; i<=size; i++) {
		list.add(r.nextInt(1000));
	}
	return list ;
}
public static List<Integer> convertToIntList(List<String> str){
	List<Integer> num = new ArrayList<>();
	
	for(int i=0; i<str.size(); i++) {
		num.add(Integer.parseInt(str.get(i)));
	}
	return num;
}
}
