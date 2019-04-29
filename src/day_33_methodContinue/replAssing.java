package day_33_methodContinue;

public class replAssing {

//	public static void main(String[] args){
//	    System.out.println(mergeStrings("selenium","java"));
//	  }
//	  public static String mergeStrings(String one, String two) {
//	    String newWord="";
//	    int maxLength;
//	    int minLength;
//	    
//	   if(one.length()<two.length()) {
//	    	minLength=one.length();
//	    	maxLength=two.length();
//	    }else {
//	    	minLength=two.length();
//	    	maxLength=one.length();
//	    }
//	   
//	   if(one.length()==two.length()) {
//	    for(int i=0; i<one.length(); i++) {
//	    	newWord=newWord+one.charAt(i)+two.charAt(i);
//	    }
//	    }
//	   else if(one.length()!=two.length()) {
//		   for(int i=0; i<minLength; i++) {
//			   newWord=newWord+one.charAt(i)+two.charAt(i);
//		   }
//		   if(two.length()==maxLength) {
//		   newWord=newWord+two.substring(minLength);}
//		   else {newWord=newWord+one.substring(minLength);
//			   
//		   }
//	   }
//	   
//	    return newWord;
//	    
//	  }
	
	 public static void main(String[] args) {
		    //test your code
		    System.out.println(uniqueChars("mama")) ;
		  }
		  
		  public static String uniqueChars(String str) {
		    //TODO: write your below
		    String unique="";
		   
		    for(int i=0; i<str.length();i++) {
		    	if(!unique.contains(str.substring(i,i+1))){
		    		unique=unique+str.charAt(i);
		    		
		    	}
		    }
		    return unique;
		    
		  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}