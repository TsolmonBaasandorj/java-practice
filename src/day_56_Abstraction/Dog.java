package day_56_Abstraction;

public class Dog extends Animal{
	private String breed;
	  private int humanYears;
		public Dog(String name, int age, String breed){
		  super(name,age);
		  this.breed=breed;
		}
		public String toString(){
		  return "Name: "+getName()+"\n"+"Breed: "+breed+"\n"+"Age in calendar years: "+getAge()+"\n"+"Age in human years: "+humanYears;
		}
		
		public String getBreed(){
		  return breed;
		}
		public void setBreed(String breed){
		  this.breed=breed;
		}
		public int getHumanYears(){
		  return humanYears;
		}
		public void setHumanYears(int humanYears){
		  this.humanYears=humanYears;
		}
		public int getAgeInHumanYears(){
			  if(getAge()<=2){
				    setHumanYears(getAge()*11);
				    return getHumanYears();
				  }else{
				    setHumanYears(22+((getAge()-2)*5));
				   return getHumanYears();
				  }
		  
		}
		@Override
		public boolean equals (Object obj){
		  Dog other=(Dog) obj;
		if(super.getName().equals(other.getName()) && super.getAge()==other.getAge() && breed.equals(other.getBreed())){
			    return true;
			  }
			  return false;
		  
		}

		
		public static void main(String[] args) {
			Dog dog1=new Dog("dog1", 10, "breed1");
			Dog dog2=new Dog("dog1", 10, "breed1");
			System.out.println("dog1 hash: "+dog1.hashCode());
			System.out.println("dog2 hash: "+dog2.hashCode());
			System.out.println("===== "+dog1.equals(dog2));
			System.out.println(dog1==dog2);
			System.out.println(dog1.equals(dog2));
		}
		
	
}
