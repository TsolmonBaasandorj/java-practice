package OverRideHaku;

public class position_manger {
	public String[][] boardR;//board array

	  private String[] shipTypes = new String[]{"ss","m","dddd","ccc"};
	  
	  public position_manger(String[][] br){
	     boardR = br;
	  
	  }//end constructor
	  
	  public boolean placeShip(int row,int column,int dir,int shipT){
		  if(isValidPos(row,column,dir,shipT)) {
			  int length=shipTypes[shipT].length();
			  String s=shipTypes[shipT].substring(0,1);
			  if(dir==0) {
			    	for(int i=1; i<=length-1;i++) {
			    		boardR[row+i][column]=s;
			    		
			    	}
			    }else {
			    	for(int k=1; k<=length-1; k++) {
			    		if(!boardR[row][column+1].equalsIgnoreCase("w")) {
			    			return false;
			    		}
			    		return true;
			    		
			    	}
			    }
		  }
		  
	      return true;
	    
	  }//end place_ship
	  
	  public boolean isValidPos(int row,int column,int dir,int len){
		  int length=shipTypes[len].length();
	    String s=boardR[row][column];
	    
	    if(s.equalsIgnoreCase("w")) {
	    if(dir==0) {
	    	for(int i=1; i<=length-1;i++) {
	    		if(!boardR[row+i][column].equalsIgnoreCase("w")) {
	    			return false;
	    		}
	    	}
	    }else {
	    	for(int k=1; k<=length-1; k++) {
	    		if(!boardR[row][column+k].equalsIgnoreCase("w")) {
	    			return false;
	    		}
	    		
	    	}
	    	
	    }
	    return true;
	    }
	      
	      return false;
	  }//end isValidPos
	  
	  
}
