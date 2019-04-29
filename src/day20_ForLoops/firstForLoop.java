package day20_ForLoops;

public class firstForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for(int i=1; i<=10;i++) {
//	System.out.println(i+": Love Java");
//}


//for(int i=5; i<=15; i++) {
//	System.out.print(i +", ");
//}
//	System.out.println();
//	for(int i=20 ;i>=10 ; i--) {
//		System.out.print(i + ", ");
//	}
//	
	
	
	for(int i=1; i<=100; i++) {
		if(i%2==0) {
			System.out.print(i + " ");
		}
			
		
	}
	System.out.println();
	
	for(int i=1; i<=100; i+=2) {
		System.out.print(i + " ");
	}
	System.out.println();
	int sum=0;
	
	for(int i=0; i<=100; i+=2) {
		sum=sum+i;
	}
	System.out.println("Sum of the even number: "+ sum);
	
	for(int i=1; i<=100; i+=2) {
		sum=sum+i;
	}
	
	System.out.println("The sum of the odd number: "+sum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
