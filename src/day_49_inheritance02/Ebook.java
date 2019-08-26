package day_49_inheritance02;

public class Ebook extends Book {
private int size;
private int pages;
public void readEBook(int pageNum) {
	
	System.out.println("Reading "+getTitle()+" book by "+getAuthor()+" at page "+getPages());
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}




}
