package day15_string;

public class googleSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String item= "java";
String pageTitle = item + " - Google Search";
if(pageTitle.startsWith(item)) {
	System.out.println("Page title check passed!");
}else System.out.println("Fail!");
		
if(pageTitle.endsWith("Google Search")) {
	System.out.println("PASS: Google search is in title");
}else System.out.println("Fail");
		
	}

}
