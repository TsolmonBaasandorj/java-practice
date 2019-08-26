package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class topping3 {

	public static void main(String[] args) {
		
		
Map<String, String> map = new HashMap<>();
//map.put("potato", "ketchup");
map.put("salad","pepper");
//map.put("fries", "butter");

if(map.containsKey("potato")){
	 map.put("fries", map.get("potato"));
	  }
	  if(map.containsKey("salad")){
	 map.put("spinach", map.get("salad"));}
System.out.println(map);

	}

}
