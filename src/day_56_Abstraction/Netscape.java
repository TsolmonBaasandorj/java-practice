package day_56_Abstraction;

public class Netscape extends Browser {

	public void navigate(String url) {
	System.out.println("Netscape - navigating to "+url);
}
    public void displayWebpage() {
	System.out.println("Netscape - displaying webpage ");
}
    public boolean launch() {
	return true;
}


}
