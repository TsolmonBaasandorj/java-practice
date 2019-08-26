package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class word0 {
public static void main(String[] args) {
	Map<String, Integer> map= new HashMap();
	String[] arr = {"c","b","a"};
	
	for(int i=0; i<arr.length; i++) {
		if(!map.containsKey(arr[i])) {
		map.put(arr[i],0);}
	}
	System.out.println(map);
}
}
