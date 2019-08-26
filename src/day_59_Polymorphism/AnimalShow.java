package day_59_Polymorphism;

public class AnimalShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal animal = new Animal();
//Polymorphism : Reference type: Animal, object: Tiger, Cheetah, Zebra

Animal tiger = new Tiger();
Animal cheetah = new Cheetah();
Animal someAnimal = new Zebra();
animal.talk();
tiger.talk();
cheetah.talk();
someAnimal.talk();
Animal[] animals = new Animal[3];
animals[0] = new Tiger();
animals[1] = new Cheetah();
animals[2] = new Zebra();
animals[0].talk();
animals[1].talk();
animals[2].talk();


	}

}
