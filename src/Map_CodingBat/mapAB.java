package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class mapAB {

	public static void main(String[] args) {
Map<String, String> map = new HashMap<>();
map.put("a", "Hi");
map.put("b", "There");
if(map.containsKey("a") && map.containsKey("b")) {
	map.put("ab", map.get("a")+map.get("b"));
}
System.out.println(map);

	}

}
