package day16_stringManupulation;

public class isEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "";
		String password = "";
		System.out.println(userName.isEmpty());

		if (userName.isEmpty()) {
			System.out.println("Username field cannot be empty");
		} else {
			System.out.println("Username is not empty");
		}

		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password cannot be empty");
		} else
			System.out.println("Username or password is not empty");
		
		
		
		
		
		

	}

}
