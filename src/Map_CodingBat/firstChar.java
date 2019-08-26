package Map_CodingBat;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class firstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> map = new HashMap<>();
String[] strings= {"apple", "bells", "salt", "aardvark", "bells", "sun", "zen"};

for(int i=0; i<strings.length; i++) {
	int count=0;
	for(int k=0; k<strings.length; k++) {
		System.out.println("i: "+strings[i]);
		System.out.println("k: "+strings[k]);
		
		if(strings[i].substring(0,1).equals(strings[k].substring(0,1))
				&& i!=k) {
			count++;
			
			
			map.put(strings[i].substring(0,1), strings[k]+strings[i]);
			break;
			
		}else {
			
			map.put(strings[i].substring(0,1), strings[i]);
		}
	}
}
System.out.println(map);
//"appleaardvark", "b": "bellsbellsbells", "s": "saltsun", "z": "zen"
	}

}
