package day_43_encapsulation;

public class Shopping {
private String item;
private Double price;

@Override
public String toString() {
	return "Shopping [item=" + item + ", price=" + price + "]";
}
public Shopping(String item, double price) {
	this.item=item;
	this.price=price;
	
}
public Shopping() {
	this.item="Jacket";
    this.price=50.0;
	
}
public String getItem() {
	return item;
}

public void setItem(String item) {
	this.item = item;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

public double total(String item, double price) {
	int countItem=1;
	
	double total=countItem*price;
	return total;
}
}
