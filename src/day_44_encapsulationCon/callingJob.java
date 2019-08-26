package day_44_encapsulationCon;

import java.util.ArrayList;

public class callingJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Job  job3= new Job("manager", "apple", 114000.0);
job3.setAnnualSalary(34000);
job3.setTitle("Sdet");
job3.setCompany("Freddie Mac");
System.out.println(job3);

Job job1= new Job();
Job job2 = new Job("dev");

ArrayList<Job> list = new ArrayList<>();
list.add(job3);
list.add(new Job("Scrum Master", "Google", 123000));
list.add(new Job("SDET", "FreddieMac", 100000));
list.add(new Job("BA", "Leido", 98000));
list.add(new Job("Senior QA Tester", "Delta", 150000));
//list.add(new Job("Haha"));

double max=0;
int idx=-1;
for(int i=idx+1; i<list.size(); i++) {
if(list.get(i).getAnnualSalary()>max) {
	max=list.get(i).getAnnualSalary();
	idx=i;}
}
System.out.println("Highest Salary: "+list.get(idx));
System.out.println(list);


	}

}
