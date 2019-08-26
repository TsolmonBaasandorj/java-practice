package day_49_inheritance02;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ebook ebook = new Ebook();
ebook.setTitle("Introduction to Java");
ebook.setAuthor("Savitch");
ebook.setPages(1016);
ebook.setPrice(170);
ebook.setSize(500);
ebook.setType("Tech Book");
System.out.println(ebook.getTitle());
System.out.println(ebook.getAuthor());
ebook.readEBook(32);


AudioBook audiobook = new AudioBook();
audiobook.setNarrator("Marufjon");
audiobook.setTitle("OCA prepration");
audiobook.setAuthor("Jeanne");
audiobook.listen();

PaperBack pb = new PaperBack();
pb.setAuthor("Malcom Gladwell");
pb.setTitle("Outliers");
pb.setType("Biography");
pb.setPages(304);
pb.setPrice(20);
System.out.println(pb.toString());

	}

}
