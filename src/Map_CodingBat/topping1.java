package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class topping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> map = new HashMap<>();
//map.put("ice cream","peanuts");
map.put("","");
//map.put("pancake", "syrup");

map.put("bread", "butter");
for(String a: map.keySet()){
    if(a.equals("ice cream")){
    	map.put("bread", "butter");
       map.put("ice cream", "cherry");}
    if(a.equals("bread")){
       map.put("bread", "butter");}
    if(a.equals("pancake")){
       map.put("pancake", "syrup");}
    
  }
System.out.println(map);
	}

}
