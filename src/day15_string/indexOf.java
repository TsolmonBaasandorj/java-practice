package day15_string;

public class indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word1="github";
System.out.println(word1.indexOf("h"));
		
	System.out.println(word1.indexOf("th"));	
		System.out.println(word1.indexOf("java"));
		
		
	String url = "www.okta.com";
	int index=url.indexOf(".");
	int index1=url.lastIndexOf(".");
	System.out.println("position of . = " + index);
	System.out.println("last position of . = "+index1);
	System.out.println(url.charAt(index+2));
		
	
	
	
	
	
	String title="java - Google Search";
	int dash = title.indexOf("-");
	
	System.out.println("The index of dash: " +dash);
	System.out.println("The front of dash: " + title.charAt(dash-2));
	System.out.println("The back of dash: " + title.charAt(dash+2));
	
	
	
	String country="United States of America";
	int states = country.indexOf("States");
	System.out.println(country.charAt(states) +""+country.charAt(states+1)+""+country.charAt(states+2)+""+country.charAt(states+3)+""+ country.charAt(states+4)+ ""+ country.charAt(states+5));
	
	String word2 = "java, c++, python, tomcat, eclipse";
	if(word2.contains("c++")) {
		System.out.println("c++ is there");
	}else System.out.println("c++ is not there");
	
	if(word2.indexOf("c")>=0) {
		System.out.println("c++ is there.");
	};
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
