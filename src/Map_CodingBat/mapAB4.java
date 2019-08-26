package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class mapAB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> map = new HashMap<>();
map.put("a", "aaa");
map.put("b", "bbb");
if(map.get("a").length()==map.get("b").length()) {
	map.put("a", "");
	map.put("b", "");
}else {
if(map.get("a").length()>map.get("b").length()) {
	map.put("c", map.get("a"));
}else {
	map.put("c", map.get("b"));
}}
System.out.println(map);
	}

}
