package day_27_mArray;

public class canvasURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String url="https://learn.cybertekschool.com/courses/147";
	
	//147--> Java programming
	//204--> Mentoring session
//    149--> SDLC
//    152-->QA testing
//    144-->Team Activity
//    143-->Welcome

String[] urlArr= url.split("/");
System.out.println(urlArr[urlArr.length-1]);
int courseId=Integer.parseInt(urlArr[urlArr.length-1]);

	
switch(courseId) {
case 147:
	System.out.println("Java programming");
	break;
case 204:
	System.out.println("Mentoring Session");
	break;
case 149:
	System.out.println("SDLC");
	break;
case 152:
	System.out.println("QA testing");
	break;
	default:
		System.out.println("Invalid Number");
		break;
}


	
	}
	

}
