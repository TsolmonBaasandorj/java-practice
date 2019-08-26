package day_52_inheritance04;

public class EqualsMethod {
	public static void main(String[] args) {
		
	
Computer comp1 = new Computer("iMac","silver");
Computer comp2 = new Computer("iMac","silver");
Computer comp3 = comp2;
System.out.println(comp1==comp2);
System.out.println(comp1.equals(comp2));
System.out.println(comp2==comp3);
System.out.println(comp2.equals(comp3));



	}
	 //   book.setTitle("MaruF The cool"); => "Maruf the Cool" is assigned to this.title
    // *
    // *      book.setTitle("the Chronicles OF TrumP"); => "The Chronicles of Trump" is assigned to this.title
    
}
