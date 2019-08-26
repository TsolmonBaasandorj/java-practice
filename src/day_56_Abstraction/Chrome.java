package day_56_Abstraction;

public class Chrome extends Browser{
public Chrome(String name, int id) {
	super(name,id);
}
public void navigate(String url) {
	System.out.println("Chrome - navigating to "+url);
}
    public void displayWebpage() {
	System.out.println("Chrome - displaying webpage ");
}
    public boolean launch() {
	return true;
}

}
