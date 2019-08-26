package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class wordMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, Boolean> map = new HashMap<>();
String[] strings= {"a", "b", "a", "c", "b"};
for(int i=0; i<strings.length; i++) {
	int count=0;
	for(int k=0; k<strings.length; k++) {
		if(strings[i].equals(strings[k])) {
			count++;
		}
	}
	if(count>=2) {
		map.put(strings[i],true);
	}else {
		map.put(strings[i],false);
	}
}
System.out.println(map);
	}

}
