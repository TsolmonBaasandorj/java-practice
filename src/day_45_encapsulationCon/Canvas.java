package day_45_encapsulationCon;
import java.lang.reflect.Array;
import java.util.*;
public class Canvas {

	public static void main(String[] args) {
		int[] nums= {3, 2, 4, 5, 8};
		int count=2;
		int[] arr=new int[count];
		int idx=-1;
		for(int j=0; j<arr.length;j++) {
		for(int i=idx+1; i<nums.length; i++) {
			if(nums[i]%2==0) {
				arr[j]=nums[i];
				idx=i;
				break;
			}
		}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		// TODO Auto-generated method stub
		Course course1 = new Course();
		course1.setName("Java Programming");
		
		List<String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasyl");
		javaTeachers.add("Murodil");
		javaTeachers.add("Marufjon");
		javaTeachers.add("Muhtar");
		
		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());
		
		List<String> javaStudents = new ArrayList<>();
		javaStudents.add("Burak");
		javaStudents.add("Roman");
		javaStudents.add("Gulnar");
		javaStudents.add("Ethem");
		javaStudents.add("Sung");
		
		course1.setStudents(javaStudents);
		System.out.println(course1.toString());
		
		course1.addTeacher("Maria");
		course1.addStudent("Ekaterina");
		
		if(course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		if(course1.getStudents().contains("Ekaterina")) {
			System.out.println("Ekaterina is a student");
		}else {
			System.out.println("Ekaterina is not a student");
		}
		
		course1.removeTeachers("Murodil");
		course1.removeStudent("Roman");
		
		if(!course1.getTeachers().contains("Murodil")) {
			System.out.println("Murodil is removed successfully");
		}else {
			System.out.println("Murodil is still a teacher");
		}
		
		if(!course1.getStudents().contains("Roman")) {
			System.out.println("Roman is removed successfully");
		}else {
			System.out.println("Roman is still a student");
		}
		
int n=10;

String num=Integer.toString(n);
//String[] arr= {"a", "b", "c", "d"};
int m=3;

//System.out.println(Arrays.toString(wordsFront(arr,m)));

	}
	public static String[] wordsFront(String[] words, int n) {
		  ArrayList<String> list = new ArrayList<>();
		  for(int i=0; i<1; i++){
		    for(int j=0; j<n; j++){
		      list.add(words[j]);
		      
		    }
		  }
		  
		  String[] arr = new String[list.size()];
		  for(int i=0; i<list.size(); i++){
		    arr[i]=list.get(i);
		  }
		  return arr;
		}

}
