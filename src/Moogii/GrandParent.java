package Moogii;



public class GrandParent {
	int age;
	public GrandParent () {
		
	}
	
	
	public static void vowelsOfNames(String name1, String name2) {
		String combine = name1+name2;
		System.out.println(combine);
		char []letter = {'a','e','u','i','o'}; 
		for (int i = 0; i < combine.length(); i++) { //i=0
		for (int j = 0; j < letter.length; j++) {
			if(combine.charAt(i)==letter[j]) {
				
				System.out.print(letter[j]);
			}
		}
		}
		System.out.println("\n");
		
	}
}
