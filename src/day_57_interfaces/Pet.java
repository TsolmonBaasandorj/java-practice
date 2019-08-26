package day_57_interfaces;

public interface Pet {
	public static final boolean friendly=true;
    public abstract void keepAsPet();
    public default void play() {
    	System.out.println("playing hide-and-seek witha pet");
    }
    public static void feed(String food) {
    	System.out.println("Feeding a pet with "+food);
    }
    public static void main(String[] args) {
		//1
    	//12
    	//123
    	//1234
	}
}
