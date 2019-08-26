package day_45_encapsulationCon;

import java.util.Random;

public class EtsyAccount {
private String email;
private String firstName;
private String password;

//constructor1;
public EtsyAccount() {
	email="";
	firstName="";
	password="";
}
//constructor2;
public EtsyAccount(String email, String firstName, String password) {
	setEmail(email);
	setFirstName(firstName);
	setPassword(password);
}
public EtsyAccount(String email, String firstName) {
    setEmail(email);
    setFirstName(firstName);
    this.password = getRandomPassword();
}

private String getRandomPassword() {
    Random rd = new Random();
    String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
    String rdPassword = "";
    for(int i = 1; i <= 6; i++) {
        rdPassword+=letters.charAt( rd.nextInt( letters.length()));
    }
    return rdPassword;
}

@Override
public String toString() {
	return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	int idx=email.indexOf("@");
	if(idx!=-1 && idx!=0 && idx!=email.length()-1 && email.contains("@")) {
		this.email = email;
	}else {
		System.out.println("Please enter a valid email address");
	}
	
}
private boolean isValidFirstName(String firstName) {

	if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
		return false;
	}
	if(firstName.isEmpty()) {
		System.out.println("Can not be blank!");
	}
	for(int i=0; i<firstName.length(); i++) {
		char ch= firstName.charAt(i);
		if(!Character.isAlphabetic(ch) && !Character.isWhitespace(ch)) {
			return false;
		}
	}
	return true;
	
}
private void isValidPassword(String password) {
	if(password.length()<6) {
		System.out.println("Must be at least 6 characters.");
	}else {
		this.password=password;}
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
if(isValidFirstName(firstName)) {
  this.firstName = firstName;
}else {
  System.out.println("Your first name contains invalid characters.");
}
	
	
	
	
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
