package day20_ForLoops;

public class indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String word="Amazon";
    char letter = 'm';
    int index=0;
    
    for(int i=0; i<word.length(); i++) {
    	if(word.charAt(i)=='m') {
    		index=index+i;
    		break;
    	}
    }
    System.out.println(index);
	
	}

}
