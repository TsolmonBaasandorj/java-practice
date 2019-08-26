package test;

import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println(countYZ("!!day--yaz!!"));
		System.out.println(GetSumFromStr("1a2b3v4!5%(4*1"));
		System.out.println(onlyStrReturn("1a2b3c4!5%d'\"(4*1"));
		System.out.println(GetDot("a\\b\\c\\e"));
		
	
  }
public static int sumDigits(String str) {
	  int sum=0;
	  
	  for(int i=0; i<str.length(); i++) {
		  boolean numeric=false;
		  int temp=0;
		  try {
		  temp = Integer.parseInt(str.substring(i,i+1));
		  }catch(NumberFormatException e) {
			  numeric = false;
		  }
		  numeric=true;
		  if(numeric) {
			  sum+=temp;
		  }
	  }
	  
	return sum;
	}

public static int countYZ(String str) {
    str=str.replaceAll("[^a-zA-Z]"," ");
    String[] arr = str.split(" ");
	
		  int count=0;
		  for(int i=0; i<arr.length; i++) {
			  
			  if(!arr[i].isEmpty()) {
		  if(arr[i].toLowerCase().charAt(arr[i].length()-1)=='z'||arr[i].toLowerCase().charAt(arr[i].length()-1)=='y') {
			  count++; }
			  
			}
		  }
		  return count;
}  

public static int GetSumFromStr(String str) {
	
	str=str.replaceAll("[\\D]",""); //[^a-zA-Z]
	int sum=0;
	for(int i=0; i<str.length(); i++) {
		sum=sum+Integer.parseInt(str.substring(i,i+1));
	}
	
	return sum;
}
public static String onlyStrReturn(String str) {
	str=str.replaceAll("[\\w]",""); 
	
	
	return str;
}

public static String GetDot(String str) {
	
	str=str.replaceAll("[/]","#");
	
	return str;
}
//public static void main(String[] args) {
//String str="13kj4";
////System.out.println(sumDigits(str));
//}

//public static int sumDigits(String str) {
//  int sum=0;
//  
//  for(int i=0; i<str.length(); i++) {
//	  boolean numeric=false;
//	  int temp=0;
//	  try {
//	  temp = Integer.parseInt(str.substring(i,i+1));
//	  }catch(NumberFormatException e) {
//		  numeric = false;
//	  }
//	  numeric=true;
//	  if(numeric) {
//		  sum+=temp;
//	  }
//  }
//  
//return sum;
//}



}





























