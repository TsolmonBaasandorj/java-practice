package OverRideHaku;

public class Child extends Parent {

	public static void main(String[] args) {
		int n=1;
		int n1=2;
		int n3=3;
		int n4=4;
		int n5=5;
		
		
		int temp=2;
	int[] arr= {n,n1,n5,n3,n4};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==temp) {
				System.out.println(i);
			}
		}
		
		
	}
	
//	public void favStyle() {
//		System.out.println("American");
//	}
}
