package day_27_mArray;

import java.util.Arrays;

public class replAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "jhgjhgkjh,grape,bread,orange,python,skjdakjsdk, skldasjdhas";

String[] strArr= str.split(",");

int minLength =strArr[0].length();
int index=-1;

int count=0;
for(int i=0; i<strArr.length; i++) {
	if(strArr[i].length()<minLength) {
		minLength=strArr[i].length();
		count++;
		
		
		
		
		}

}
System.out.println("Count: "+count);
System.out.println(minLength);
String[] container= new String[count];

for(int i=0; i<container.length; i++) {
	for(int j=index+1; j<strArr.length; j++) {
		if(strArr[j].length()==minLength) {
		container[i]=strArr[j];
		index=j;
		break;
		
	}
	}
	
}
System.out.println(Arrays.toString(container));


	}

}
