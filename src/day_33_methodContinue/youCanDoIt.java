package day_33_methodContinue;

public class youCanDoIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(coverString("hi", "hi") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
		  
		  if(main.contains(coverME)) {
			  main=main.replace(coverME,"["+coverME+"]");
			  
			  
		  }else {
			  return "["+main+"]";
		  }
	    
		return main;
	    
		  
		  
	    
	  }
	  

}
