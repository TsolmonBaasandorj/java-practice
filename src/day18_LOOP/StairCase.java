package day18_LOOP;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String star="*";
     String newStar="";
     int num=0;
     while(num<10) {
    	 newStar=newStar+star;
    	 System.out.println(newStar);
    	  num++;
    	  
    	 String stairs="*";
    	  
    	 while(stairs.length()<=10) {
    		 System.out.println(stairs);
    		 stairs+="*";
    	 }
    	  
    	  
    	  
    	  
      }
      
	}

}
