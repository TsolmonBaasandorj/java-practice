package day_39_ArrayList;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student = new Student();
student.name="Roman";
student.age=25;
student.subject = "Java";

System.out.println("Name: "+student.name);
System.out.println("Age: "+student.age);
System.out.println("Subject: "+student.subject);

System.out.println();
Student student2 = new Student();
student2.name="Cleetus";
student2.age=26;
student2.subject="Selenium";
System.out.println("Name: "+ student2.name);
System.out.println("Age: "+student2.age);
System.out.println("Subject: "+student2.subject);
	}

}
