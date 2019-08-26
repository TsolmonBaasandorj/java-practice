package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class mapShare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String > map = new HashMap<>();
//map.put("a", "aaa");
map.put("b", "bbb");
map.put("c", "ccc");

if(map.containsKey("a")) {
map.put("b", map.get("a"));
map.remove("c");
}else {
	map.remove("c");
}
System.out.println(map);
	}

}
