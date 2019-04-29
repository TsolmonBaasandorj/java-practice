package day25_ArrayContinue;

public class population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] product = {"LV bag", "Chanel bag", "Celine bag", "Burberry bag"};
double[] price= {1000, 2500, 100, 1500};
int[] productId = {12345, 12346, 12347, 12348};

for(int i=0; i<product.length; i++) {
	System.out.println("Item"+(i+1) + ": "+product[i] + " is $" + price[i]);
}
double maxPrice=0;

double minPrice= price[0];
int minIndex=0;
int maxIndex=0;
for(int i=0; i<price.length; i++) {
	if(price[i]>maxPrice) {
		maxPrice=price[i];
		maxIndex=i;
		
	}if (price[i]<minPrice) {
		minPrice=price[i];
		minIndex=i;
		
	}
		
}
System.out.println("Max value of: "+ product[maxIndex] + " is $"+maxPrice);
System.out.println("Min value of: "+ product[minIndex]+ " is $"+minPrice);

	}

}
