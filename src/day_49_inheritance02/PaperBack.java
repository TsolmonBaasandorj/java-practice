package day_49_inheritance02;

public class PaperBack extends Book {
private int pages;

public void setPages(int pages) {
	this.pages = pages;
}

public int getPages() {
	return pages;
}

public String toString() {
	return getTitle() +" | " + getAuthor() +" | " + getPrice() +" | "+getType() +" | " + pages;
}
}
