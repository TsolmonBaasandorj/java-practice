package day_38_ArrayList;
import java.util.*;
public class ArrayListContainsAndContainsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list1 = new ArrayList<>();
list1.add("Jan");
list1.add("Feb");
list1.add("Mar");
list1.add("Apr");
list1.add("May");

System.out.println(list1.toString());
ArrayList<String> list2 = list1;
System.out.println(list2);// list1, list2 point to the same object
ArrayList<String> months = new ArrayList<>(list1);
System.out.println(months);

months.add("Jun");
months.add("Jul");
months.add("Aug");
System.out.println(months);
//list1=months;
//list2=list1;
//System.out.println(list1);
//System.out.println(list2);

System.out.println(months.contains("Jan"));
System.out.println(list1.contains("Jan"));
System.out.println(months.containsAll(list1));

System.out.println(months.get(1).equals("Feb"));
System.out.println(months.indexOf("Feb") == 1);


ArrayList<String> month2 = new ArrayList<>(list1);
System.out.println("Month:"+months.toString());
System.out.println("Month2: "+ month2.toString());

if(months.containsAll(month2)) {
	System.out.println("Months has month2 values");
}else {
	System.out.println("Months does not have month2 values");
}

month2.add("Jan");

// doesn't care about duplicate value

if(months.containsAll(month2)) {
	System.out.println("Months has month2 values");
}else {
	System.out.println("Months does not have month2 values");
}


if(months.contains("Jan")) {
	System.out.println(true);
}else 
	System.out.println(false);




	}

}
