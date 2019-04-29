package day24_Array;

public class forEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for each loop work only with collection of data
// As of now , we use only array, so it will work with array but , not with a single variable
// for(DataTypeOfArray tempVariableName: arrayName){
//   }
	
	
	String[] cities= {"Washington D.C.", "Mclean", "Darkhan", "Arlington"};
	
	for(String city: cities) {
		if(city.equals("Arlington")) {
		System.out.println(city);
	}
	
	
	
	}

}
}