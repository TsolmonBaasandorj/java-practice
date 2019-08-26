package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class topping2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> map = new HashMap<>();
map.put("ice cream", "cherry");
map.put("spinach", "dirt");

if(!map.containsKey("yogurt") && map.keySet().isEmpty()==false) {
map.put("yogurt", map.get("ice cream"));
for(String each: map.keySet()) {
	if(each.equals("spinach")) {
		map.put(each, "nuts");
	}
}
}

	}

}
