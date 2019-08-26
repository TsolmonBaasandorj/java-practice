package OfficeHours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestMapSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map map = new HashMap();
map.put("apple",0);
map.put("apple", 1);
map.put("apple", 2);
map.put("fruits", 3);
map.put("banana", 4);
System.out.println(map.keySet().contains("apple"));
map.remove("apple");

System.out.println(map);
map.put(2,"apple");
map.put(3,"apple");
map.remove(2);

System.out.println(map);

Set set = new HashSet();
set.add("apple");
set.add("banana");
set.add("apple");
set.add("banana");
set.add("watermelon");
System.out.println(set);
ArrayList<String> list = new ArrayList<>(set);
Collections.sort(list);
System.out.println(list);


	}

}
