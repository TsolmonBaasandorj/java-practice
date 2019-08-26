package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> map = new HashMap<>();
String[] strings= {"man","moon","good","night"};

for(String a: strings) {
	map.put(a.substring(0,1), a.substring(a.length()-1));
}
System.out.println(map);
	}

}
