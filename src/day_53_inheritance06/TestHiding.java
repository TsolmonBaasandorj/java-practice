package day_53_inheritance06;

public class TestHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
City city = new City(234, "London");
Capital cap = new Capital(433,"Paris",5334424222L);
System.out.println(city.count);
System.out.println(cap.count);
System.out.println(city.toString());
System.out.println(cap.toString());

city.buildARoad();
cap.buildARoad();

City.buildARoad();
Capital.buildARoad();
//====================================
City city2 = new City(33344, "Fairfax");
Capital cap2 = new Capital(6544,"Richmond",12313131L);
city2.letsBuildARoad();
cap2.letsBuildARoad();
	}

}
