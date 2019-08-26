package Map_CodingBat;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, Integer> map = new HashMap<>();
String[] strings= {"a","a","a","a"};
List<String> list = new ArrayList<>();

	for(int k=0; k<strings.length; k++) {
		list.add(strings[k]);
	}
	
	
System.out.println("list: "+list);
for(String a:strings) {
	int count=0;
	for(String b:list) {
	if(a.equals(b)) {
		count++;
	}
	map.put(a, count);
}
}
System.out.println(map);
	}

}
