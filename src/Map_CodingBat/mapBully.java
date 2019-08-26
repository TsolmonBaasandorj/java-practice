package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class mapBully {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> map=new HashMap<>();
map.put("a", "candy");
map.put("b","dirt");
map.put("c", "Tsoomoo");
System.out.println(map);

if(map.containsKey("a")) {
	map.put("c", map.get("b"));
	map.put("b", map.get("a"));
	
	map.put("a", "");
}
System.out.println(map);
	}

}
