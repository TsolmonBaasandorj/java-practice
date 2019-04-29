package warmUpPrimeNumber;

public class breakPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
for(int i=1; i<=20; i++) {
	if(i>=1 && i<=10) {
		continue;}
	System.out.println("Number: " + i);

	}
System.out.println();


String str = "java";

for(int i=0; i<str.length();i++) {
	if(str.substring(i,i+1).equals("a")) {
		continue;
	}
	System.out.print(str.substring(i, i+1));
}








	}

}
