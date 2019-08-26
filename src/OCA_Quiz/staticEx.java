package OCA_Quiz;
import java.util.*;
public class staticEx {
public static void main(String[] args) {
	
	
	ArrayList<String[]> list = new ArrayList<String[]>();
	
	
	//System.out.println(isVowel('e'));
	
	String str="hello world";
	String[] r=str.split("");
	String rev="";
	for(int i=r.length-1; i>=0; i--) {
		if(isVowel(r[i])==true) {
			rev+=r[i];
		}
	}
	int j=0;
	for(int i=0; i<r.length; i++) {
		if(isVowel(r[i])==true) {
			r[i]=rev.substring(j,j+1);
			j++;
		}
	}
	
	String str2="";
	for(int i=0; i<r.length; i++) {
		str2+=r[i];
	}
	
	System.out.println(Arrays.toString(r));
	System.out.println(str2);
	}

  
public static boolean isVowel(String a) {
	String [] vow= {"a","e","i","o","u","y"};

	for(int k=0; k<vow.length; k++) {
			if((vow[k]).equalsIgnoreCase(a)) {
				return true;
	
			}
		}
	
	return false;
}
}
