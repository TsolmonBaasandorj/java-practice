package day_48_inheritance01;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		Student student = new Student();
		person.name="Obama";
		person.age=57;
		person.gender='m';
		
		student.name="Roman";
		student.age=30;
		student.gender='m';
		
		person.eat("steak");
		student.eat("grechka");
		student.code("java");
		student.attendClass("Java");
		
	}

}
