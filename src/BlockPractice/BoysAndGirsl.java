package BlockPractice;

public class BoysAndGirsl extends Kids{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoysAndGirsl n = new BoysAndGirsl();
			n.setName("Danchik");
			n.setAge(4);
			n.setGender("boy");
			n.setFavoriteToy("Cars");
			System.out.println(n.toString());
			
			Kids n2 = new Kids();
			n2.setName("Rafa");
			n2.setAge(2);
			n2.setGender("boy");
			n2.setFavoriteToy("Byke");
			System.out.println(n2.toString());
			
	         girls n3 = new girls();
	         n3.setName("Elisa");
	         n3.getNailsDone("Bluezen");
	         
	         boys n4 = new boys();
	         n4.setName("Amir");
	         n4.playSports("basketball");
		    
		}
	

}
