package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class mapAB3 {
public static void main(String[] args) {
	Map<String, String> map = new HashMap<>();
	map.put("a", "aaa");
	map.put("b","bbb");
	map.put("c", "cake");
	
	if(map.containsKey("a") && map.containsKey("b")){
		  if(map.get("a").length()==map.get("b").length()) {
			map.put("a", "");
			map.put("b", "");
		}else {
		  if(map.get("a").length()>map.get("b").length()) {
			map.put("c", map.get("a"));
		}else {
			map.put("c", map.get("b"));
		}}}
	System.out.println(map);
	String n="\n"+"dhskh";
System.out.print(n);
}
}
