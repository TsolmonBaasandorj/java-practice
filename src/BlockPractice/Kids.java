package BlockPractice;

public class Kids {
String name;
int age;
String favoriteToy;
String gender;

public Kids() {
	System.out.println("******************");
}
public Kids(String name, String gender) {
	this.name=name;
  if(gender.equalsIgnoreCase("girl")) {
  System.out.println("Her name is: "+name);
  }
  else {
	  System.out.println("His name is: "+name);
  }
}

static {
	System.out.println("Good afternoon everyone!");
}
{
	System.out.println("Today is Wednesday!");
	}
public boolean gender(String gender) {
	if(gender.equalsIgnoreCase("girl")) {
		return true;
	}else {
		return false;
	}
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getFavoriteToy() {
	return favoriteToy;
}
public void setFavoriteToy(String favoriteToy) {
	this.favoriteToy = favoriteToy;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Kids [name=" + name + ", age=" + age + ", favoriteToy=" + favoriteToy + ", gender=" + gender + "]";
}

}
