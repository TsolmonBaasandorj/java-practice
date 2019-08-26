package day_53_inheritance06;

public class Capital extends City{
	private long population;
	public int count=100;
	
	public Capital(int id , String name,long population) {
		super(id,name);
		this.population=population;
	}
	
	public static void buildARoad() {
		System.out.println("Capital City - building a road");
	}
	
	@Override
	public String toString() {
		return super.toString()+"population: "+population+
				" countCap: "+count;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	

}
