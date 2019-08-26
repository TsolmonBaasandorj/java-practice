package day_38_ArrayList;
import java.util.*;
public class CollectionsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> numsList = new ArrayList<>();
numsList.add(44);
numsList.add(1);
numsList.add(4);
numsList.add(1000);
numsList.add(3);
System.out.println(numsList);

System.out.println("Sorting ... please wait....");
Collections.sort(numsList);
System.out.println(numsList);

List<String> strList = new ArrayList<>();
strList.add("Fuad");
strList.add("Roman");
strList.add("Murad");
strList.add("Muhabbat");
strList.add("Maria");
strList.add("Dina");
strList.add("Bojan");
strList.add("Ana");
System.out.println(strList);
Collections.sort(strList);
System.out.println(strList);

//Max, Min
 int maxNum=Collections.max(numsList);
 int minNum=Collections.min(numsList);
 System.out.println("Max: "+maxNum);
 System.out.println("Min: "+minNum);
 
 String maxName = Collections.max(strList);
 String minName= Collections.min(strList);
 System.out.println("Maxname: "+maxName);
 System.out.println("Minname: "+minName);
 
 Collections.shuffle(strList);
 System.out.println(strList);

	}

}
