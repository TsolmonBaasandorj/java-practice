package BlockPractice;

public class callingKids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Kids boy = new Kids("Amirchik","boy");
boy.setAge(3);
//boy.setName("Amir");
boy.setFavoriteToy("Cards");
boy.setGender("boy");
System.out.println(boy.toString());
Kids girl = new Kids("Elisa","girl");
girl.setAge(1);
girl.setFavoriteToy("Shopping Card");
girl.setGender("Girl");
System.out.println(girl.toString());

	}

}
