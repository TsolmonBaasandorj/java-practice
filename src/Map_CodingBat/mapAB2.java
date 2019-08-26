package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class mapAB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> map = new HashMap<>();
//map.put("a","aaa");
//map.put("b","aaa");
map.put("c","aaa");

if(map.containsKey("a")&&map.containsKey("b")) {
if(map.get("a").equals(map.get("b"))) {
	map.remove("a");
	map.remove("b");
	
}}
System.out.println(map);
	}

}
