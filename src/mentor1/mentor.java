package mentor1;

public class mentor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For
		
	String word="new";
	//           12345678
	int count=0;
	
	for(int i=0; i<word.length()-2; i++) {
		
		if(word.substring(0,5).equals("fruit")) {
			count++;
		}
		
	}
	System.out.println(count);
	
	}

}
