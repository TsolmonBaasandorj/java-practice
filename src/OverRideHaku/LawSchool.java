package OverRideHaku;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;




public class LawSchool{

public static void main(String[] args) {

List<Integer> list= new ArrayList<>();
list.add(200);
list.add(100);
list.add(50);
list.add(90);

Iterator ls = list.iterator();

while(ls.hasNext()) {
	if(ls.next().equals(100)) {
		System.out.println("hello");
	}
	
}

Set<Integer> set=new HashSet<>();
set.add(1);
set.add(3);
set.add(2);
set.add(5);

//System.out.println(set.containsAll(list));
//
//List<Integer> sub=list.subList(0,2);
//
//System.out.println("Sublist: "+sub);
//
//for(int each: set) {
//	System.out.println(each);
//}


//Iterator mm= set.iterator();
//while(mm.hasNext()) {
//System.out.println(mm.next());
//}
//System.out.println("********");


//3 : 2
//6 : 2
//7 : 1
//8 : 1

System.out.println("list size "+list.size());
System.out.println("set size "+set.size());


Set<Integer> set1=new HashSet<>(list);

for(int each: set1) {
	int count=0;
	for(int each1:list) {
		if(each==each1) {
			count++;
		}
	}
	System.out.println(each+" : "+count );
}



/********Map*****/

//Map has key and value pair

Map<String,String> map=new HashMap<>();
map.put("Baasandorj1", "Omo");
map.put("Baasandorj2", "Haku");
map.put("Ibraimov", "Nuku");
map.put("Zhaanbaev", "Kuba");

Set<String> keySetList=map.keySet();

System.out.println("keySet: "+keySetList);


for(String each: map.keySet()) {
	if(each.equals("Ibraimov")) {
	System.out.println("Omo : "+map.get(each));
	}
}

for(String each: map.values()) {
	System.out.println("values: "+each);
	Collection<String> names=map.values();
}


System.out.println("preReverse: "+list);
Collections.sort(list);
System.out.println("reversed list: "+list);

System.out.println("First value : "+map.get("Baasandorj1"));

System.out.println(map);






}
}
