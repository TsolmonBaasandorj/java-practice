package Map_CodingBat;

import java.util.HashMap;
import java.util.Map;

public class wordAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//thisandthat
		//andornot
		
//String[] strings= {"this", "or", "that", "and", "this", "and", "that"};
String[] strings= {"not", "and", "or", "and", "this", "and", "or", "that", "not"};
String str="";
for(int i=0; i<strings.length; i++) {
	int count=0;
	for(int k=0; k<strings.length; k++) {
		if(strings[i].equals(strings[k])) {
			count++;
		}
		if(count==2) {
			if(!str.contains(strings[i])) {
			str+=strings[i];
			}
		}
		
	}
}
System.out.println(str);

	}

}
