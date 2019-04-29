package day_28_multid_Array;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sentence="you are very interesting person";

String[] a=sentence.split(" ");
String[] reverse= new String[a.length];

for(int i=a.length-1; i>=0; i--) {
	reverse[i]=a[i]+" ";
}

System.out.println(Arrays.toString(reverse));
	}

}
