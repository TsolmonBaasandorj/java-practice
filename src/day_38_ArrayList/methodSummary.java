package day_38_ArrayList;
import java.util.*;
public class methodSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = new ArrayList<>();
//add method to add a value
list.add("red");
list.add("blue");
list.add("white");
list.add("grey");
list.add("black");
//add method with index: "yellow will be placed to index 0";
list.add(0,"yellow");
// toString method to print all values in same line
System.out.println("All elements: "+list);
//size method
System.out.println("List size: "+list.size());
// get method , return value from index
System.out.println("Element at index 3: "+list.get(3));
System.out.println("Element at index 0: "+list.get(0));
// remove using index, removes value from index position
list.remove(0);
System.out.println("Element after at 0 index removed. "+list.toString());
//remove using value/element. removes element first occurence
list.remove("blue");
System.out.println("Elements after blue is removed: "+list);
// set(index,value) replace certain index with new value

list.set(0, "orange");
System.out.println("Elements after orange replaced red: "+list);
// indexOf(value) . returns index of value in the list

int n=list.indexOf("green");
System.out.println(n);
int m=list.indexOf("grey");
System.out.println(m);

//isEmpty() return true if list is empty. size==0;

System.out.println("is list Empty? "+list.isEmpty());
System.out.println("is list Empty? "+ (list.size()==0));

//contains(element) ==> return true if value is present

System.out.println("White in list? "+list.contains("white"));

List<String> list2 = new ArrayList<>();
//addAll ==> adds all values from one list into another
list2.addAll(list);
System.out.println(list2);
//containsAll . check if a list has all values of another list
System.out.println("does list contain list ? "+list.containsAll(list2));
//equals(list) checks if 2 lists are exactly equal
System.out.println("equals: "+ list2.equals(list));

list2.add("pink");
System.out.println(list2);

//removeAll(list) . removes all matching values from array list in that are in other


list2.removeAll(list);
System.out.println("List2 after removeAll list: "+list2);
System.out.println("List: "+list);
//AddAll(index, list) adds a new list values starting from given index
list2.addAll(1, list);
System.out.println(list2);
list2.addAll(0, list);
System.out.println(list2);
//clear. clears a list
System.out.println(list);



 }

}
