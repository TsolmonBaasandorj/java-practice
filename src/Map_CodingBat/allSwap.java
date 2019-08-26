package Map_CodingBat;

import java.util.*;

public class allSwap {

	public static void main(String[] args) {
	
		//ac,ab
String [] strings = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};

Map<String, Integer> map = new HashMap<>();


int i=0;
for(String a: strings) {
	for(String b: strings) {
		if(a.substring(0,1).equals(b.substring(0,1)) && 
		   !a.substring(1).equals(b.substring(1))) {
			map.put(a.substring(0,1)+b.substring(1),i);
			i++;
		}
	}
	
}
System.out.println(map);

	}

	 
}
