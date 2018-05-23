import java.util.Arrays;
import java.util.Comparator;

public class Car {
	private String type;
	private int year_of_production;
	private double engine_capacity;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear_of_production() {
		return year_of_production;
	}
	public void setYear_of_production(short year_of_production) {
		this.year_of_production = year_of_production;
	}
	public double getEngine_capacity() {
		return engine_capacity;
	}
	public void setEngine_capacity(float engine_capacity) {
		this.engine_capacity = engine_capacity;
	}
	
	public Car(){}
	
	public Car(String type, int year_of_production, double engine_capacity) {
		this.type = type;
		this.year_of_production = year_of_production;
		this.engine_capacity = engine_capacity;
	}
	
	public static void cars_info(Car cars []){
		for (int i=0; i<cars.length; i++){
			System.out.println("Type - "+cars[i].getType()+", year of production - "+cars[i].getYear_of_production()+", engine_capacity - "+cars[i].getEngine_capacity());
		}
	}
	
	public static void display_for_year(int year ,Car cars []){
		for (int i=0; i<cars.length; i++){
			if(cars[i].getYear_of_production()==year){
				System.out.println("Type - "+cars[i].getType()+", engine_capacity - "+cars[i].getEngine_capacity());
			}
		}
	}
	
	public static void sort_by_year(Car cars []){
		Arrays.sort(cars, new Comparator<Car>(){		
			public int compare(Car o2, Car o1) {
	            return (o2.getYear_of_production() - o1.getYear_of_production());		
		}
	});
	}
	

	
}
