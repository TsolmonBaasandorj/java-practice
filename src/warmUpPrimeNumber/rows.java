package warmUpPrimeNumber;

public class rows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 1; i <= 5; i++) {
//			if(i%2==0) {
//			for (char letter = 'A'; letter <= 'Z'; letter++) {
//				System.out.print(letter);
//			}
//			}else {
//				for(char letter = 'z'; letter>='a'; letter--) {
//					System.out.print(letter);
//				}
//			}
//			System.out.println();
//			System.out.println("**************************");
//		}
		
		String s[]="i like this program very much".split(" "); 
	    String ans=""; 
	    for(int i=s.length - 1; i >= 0; i--) { 
	        ans+=s[i]+" "; 
	          
	    } 
	    System.out.println("Reversed String:"); 
	    System.out.println(ans.substring(0,ans.length()-1));    
		}
	

}
