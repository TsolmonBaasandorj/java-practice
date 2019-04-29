package Day_30_Method;

public class EtsySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		navigateToEtsy();
		searchForWoodenSpoon();
		printResult();
	}
public static void navigateToEtsy() {
	System.out.println("Launch Chrome browser");
	System.out.println("Navigate to www.etsy.com");
}
public static void searchForWoodenSpoon() {
	System.out.println("Type 'Wooden' spoon into search field");
	System.out.println("Click 'Search' button");
}
public static void printResult() {
	System.out.println("Print result: 14,720 result");
}
}
