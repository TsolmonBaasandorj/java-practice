package day24_Array;

public class splitSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
 String sentence = "Java is a general-purpose computer-programming language "
 		+ "that is concurrent, class-based, object-oriented,"
 		+ " and specifically designed to have as few implementation dependencies as possible.";
 
     String[] word = sentence.split(" ");
     
     for(String str: word) {
    	 if(str.equals("is")) {
    		 break;
    	 } counter++;
     }
     System.out.println("Position: "+ counter);
     System.out.println(word[counter]);
     
     
 
     }
	}


