package day_40_Class;

public class BestBuy {

	public static void main(String[] args) {
		CellPhone cell1 = new CellPhone();
		cell1.brand="Nokia 6300";
		cell1.screenSize=2;
		cell1.color="blue";
		cell1.price=99.9;
		System.out.println("Brand name: "+cell1.brand);
		System.out.println("ScreenSize: "+cell1.screenSize);
		System.out.println("Color: "+cell1.color);
		System.out.println("Price: "+cell1.price);
		
		System.out.println();
		CellPhone cell2 = new CellPhone();
		cell2.brand="Siemens";
		cell2.screenSize=1.5;
		cell2.color="blue";
		cell2.price=39.22;
		System.out.println("Brand name: "+cell2.brand);
		System.out.println("ScreenSize: "+cell2.screenSize);
		System.out.println("Color: "+cell2.color);
		System.out.println("Price:" +cell2.price);
		System.out.println();
		System.out.println("#### Calling method ####");
		cell1.call();
		cell1.message();
		System.out.println();
		cell2.call();
		cell2.message();
		System.out.println();
		cell1.takeAPhoto();
		cell2.takeAPhoto();
		
		
	}

}
