package day_56_Abstraction;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog dog = new Dog("Bondoi",3,"spanel");
System.out.println(dog.getName());
System.out.println(dog.getAge());
//System.out.println(dog.getHumanYears());

System.out.println(dog.getAgeInHumanYears());
System.out.println(dog.toString());
	}

}
