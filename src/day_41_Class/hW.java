package day_41_Class;
import java.util.*;
public class hW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		int[] outer= {1, 2, 4, 6};
//		int[] inner= {2, 4};
//		boolean found=false;
//		int idx=-1;
//		for(int i=0; i<inner.length; i++) {
//			found=false;
//			for(int j=0; j<outer.length; j++) {
//				if(inner[i]==outer[j]) {
//					found=true;
//					break;
//			}
//				}
//			if(found==false) {
//				break;
//			}
//		}
// 		
//		
//		System.out.println(found);
		
		
		
		
		
		
		
		
		
//		String str="this test";
//		int f=str.indexOf(" ");
//		int l=str.lastIndexOf(" ");
//		
//		for(int i=0; i<str.length()-2;i++) {
//			if(str.substring(i,i+2).equals("is") && str.substring(i+2,i+3).matches("[^a-z]")) {
//	str=str.substring(i,i+2)+" not ";}
//			
//		}
//			System.out.println(str);
			
			
			
			
		
		
		
		
		//System.out.println(max);
		//System.out.println(value
//		String n=value;
//		
//		str=str.replaceAll("[^X]", " ");
//		System.out.println(str);
//		String[] arr=str.split(" ");
//		System.out.println(Arrays.deepToString(arr));
//		
//		
		
		
		
		
		
		
		
		
		
		

//		System.out.println(isAnagram("java", "cava"));
	}
//ArrayList<Integer> n= new ArrayList<>();
//n.add(10);
//n.add(30);
//n.add(40);
//
//timesTwo(n);
//System.out.println(isPalindrome("wooden"));

//	}
//public static void timesTwo(ArrayList<Integer> nums) {
//	for(int i=0; i<nums.size(); i++) {
//		nums.set(i,nums.get(i)*2);
//	}
//	System.out.println(nums);
//	
//	
//}
//public static boolean isPalindrome(String check) {
//	String reverse="";
//	for(int i=check.length()-1; i>=0; i--) {
//		reverse=reverse+check.charAt(i);
//	}
//	reverse=reverse.replace(" ", "");
//	check=check.replace(" ", "");
//	if(check.equalsIgnoreCase(reverse)) {
//		return true;
//	}
//	
//	return false;
//}
public static boolean isAnagram(String word1, String word2) {
	 word1=word1.replace(" ","").toLowerCase();
	  word2=word2.replace(" ","").toLowerCase();
	  
    for(int i=0; i<word2.length(); i++) {
    	if(!word1.contains(word2.substring(i,i+1))) {
    		return false;
    	}
    }
	
	return true;

}
}
