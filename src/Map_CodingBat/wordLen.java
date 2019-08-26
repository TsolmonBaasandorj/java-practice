package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class wordLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, Integer> map = new HashMap<>();
String[] arr= {"this","and","that","and"};

for(String a: arr) {
	if(!map.containsKey(a)) {
		map.put(a,a.length());
	}
}
System.out.println(map);
	}

}
