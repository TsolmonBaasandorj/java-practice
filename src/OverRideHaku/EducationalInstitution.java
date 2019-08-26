package OverRideHaku;

public class EducationalInstitution {
	private int years;
	  int duration;
	  public EducationalInstitution(int duration){
	    this.duration=duration;
	  }
	  

	  public int getYears() {
		return years;
	}


	public int getDuration() {
		return duration;
	}


	public String graduationRequirements() {
		String d= String.valueOf(getDuration());
		  return d +" years of study";
	  }
}
