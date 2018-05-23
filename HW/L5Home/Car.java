/*Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of 
class Car. Display cars
certain model year  (enter year in the console);
ordered by the field year.*/
public class Car {
private String type;
	private short year_production;
private float engine_capacity;
//ordered by the field year
public static void showCarIntoYear(Car[] cars,int year) {
	for(int i=0;i<cars.length;i++)
	if(cars[i].year_production==year)
		cars[i].showInfo();
}
public  void showInfo() {
	System.out.println("Type:"+this.type+" year:"+ this.year_production + " capacity "+this.engine_capacity);
}
// sort by year <>
public static void sortByYear(Car[] cars) {
	
	
}


}
