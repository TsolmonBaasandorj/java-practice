/**
 * 
 */
/**
 * @author Tsolmon
 *
 */
package day_51_inheritance04;

class Over{
	
	public static void main(String[] args) {
		Over page=new Over();
		System.out.println(page.sumInt(2, 3,5,6,7,5,4,3,3,5,6,7));
//		String n1="2";
//		String n2="3";
//		page.sumInt(Integer.parseInt(n1), Integer.parseInt(n2));
		page.sumInt("2","3");
		
	}
	
	
	public int sumInt(int... n) {
		int sum=0;
		for(int temp:n) {
			sum+=temp;
		}
		return sum;
	}
	
	
	
	public int sumInt(int n1, int n2,int n3) {
		return n1+n2+n3;
	}
	protected void sumInt(String n1,String n2) {
		//System.out.println(Integer.parseInt(n1)+Integer.parseInt(n2));
	}
	
	
	
	
}