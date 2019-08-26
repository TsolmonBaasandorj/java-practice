package mentor1;
import java.util.*;

import OverRideHaku.Item;
public class ListRemove {
	private List<Item> regularItems;
	
	public List<Item> getRegularItems() {
		return regularItems;
	}

	public static void main(String[] args) {
		 
			    double weight = 0;
			    double cal = 0;
			    Scanner scan = new Scanner(System.in);
			    System.out.println("Enter weight in pounds:");
			    weight=scan.nextDouble();
	            double kg=weight/2.2;
	            
			    cal =(0.0175*(10*30)+0.0175*(8*30)+(0.0175*360))*kg;
			    System.out.println((int)(cal));
	  }
}
