package warmUpPrimeNumber;

public class loopFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[][]ducks= {{1,2,3,4,5}, {5,6,7,8,9}, {10,11,12,13,14}};
  
    
   
      for(int i=0; i<ducks.length;i++) {
    	  for(int j=0; j<ducks[i].length;j++) {
    		  System.out.print(ducks[i][j]+" ");
    	  }
    	  System.out.println();
      }
      
      for(char i='a'; i<='f';i++) {
    	  for(char j='a';j<='f';j++) {
    		  System.out.println(i+""+j);
    	  }
      }
      
      
      
	}
}