package day15_string;

public class contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat";
		
		if(list.contains("apples")) {
			System.out.println(true);
		}else System.out.println("Let's add apples now!");
		
		
		boolean hasEggs = list.toUpperCase().contains("EGGS");
		System.out.println(hasEggs);
		
		boolean hasCucumber = list.contains("cucumbers");
		System.out.println(hasCucumber);
		
		
		
		String email = "name@gmail.com";
		if(email.contains("yahoo")) {
			System.out.println("Yahoo account");
		}else if(email.contains("gmail")) {
			System.out.println("Gmail account");
		}else if(email.contains("hotmail")) {
			System.out.println("Hotmail account");
		}
		
		String etsyTitle = "Wooden spoon | Etsy";
		if(etsyTitle.contains("|")) {
			System.out.println("true");
		}
		
		String name = "Baasandorj";
		if(name.contains("e") || name.contains("a")) {
			System.out.println("Yes");
		}else System.out.println("No");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
