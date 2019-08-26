package day_60_Polymorphism02;

import java.util.Arrays;

public class AppleStore {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double size=7.5;
				int newSize=(int)size;
				int l = 0;
				System.out.println(l);
				String mkk = null;
				System.out.println(mkk);
				//System.out.println(mkk.equals("jhhhj"));
				
					System.out.println(l==9);
				
		
		//1
		//12
		//123
		//1234
		
	/*	1=1
	 * 2—>print 1,1,2
        3—>print 1,1,2,1,2,3
        4—>print 1,1,2,1,2,3,1,2,3,4
        5—>print 1,1,2,1,2,3,1,2,3,4,1,2,3,4,5*/
		
		for(int i=1;i<=5; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		double d=3.5;
		byte n=(byte) d;
		
		System.out.println("====="+n);
		
		
		for(int i=1; i<5; i++) {
			for(int k=1; k<i+1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		
		
AppleDevice mac = new Mac();
mac.use();
//mac.code(); is not visible
//AppleDevice methods only can be called
Mac myMac = new Mac();
myMac.code();
myMac.use();

AppleDevice watch = new AppleWatch();
watch.use();
AppleWatch watch2 = new AppleWatch();
watch2.use();
watch2.wear();



AppleDevice ap = new Mac();
System.out.println(ap.startingPrice);
//System.out.println(ap.model); == Error, reference type decide what is accessable

AppleDevice ap2 = new Ipad();
System.out.println(ap2.startingPrice);

AppleDevice ap3 = new AppleWatch();
System.out.println(ap3.startingPrice);

Mac m = new Mac();
System.out.println(m.model);
System.out.println(m.model);
	
	
	
	
	

	}
	
}
