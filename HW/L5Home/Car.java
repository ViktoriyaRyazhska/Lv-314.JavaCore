package Home;

/*Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of 
class Car. Display cars
certain model year  (enter year in the console);
ordered by the field year.*/
public class Car {
	private String type;
	private short year_production;
	private float engine_capacity;

	public Car(String type, short year_production, float engine_capacity) {

		this.type = type;
		this.year_production = year_production;
		this.engine_capacity = engine_capacity;
	}

	public Car() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public short getYear_production() {
		return year_production;
	}

	public void setYear_production(short year_production) {
		this.year_production = year_production;
	}

	public float getEngine_capacity() {
		return engine_capacity;
	}

	public void setEngine_capacity(float engine_capacity) {
		this.engine_capacity = engine_capacity;
	}

	// ordered by the field year
	public static void showCarIntoYear(Car[] cars, int year) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].year_production == year) {
				System.out.println(cars[i].toString());
			}
		}
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year_production=" + year_production + ", engine_capacity=" + engine_capacity
				+ "]";
	}

	public static void showCars(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].toString());
		}
	}

	// sort by year <>
	public static Car[] sortByYear(Car[] cars) {
		Car dummy = new Car();
		// bubble
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].year_production > cars[j].year_production) {
					dummy = cars[i];
					cars[i] = cars[j];
					cars[j] = dummy;
				}
			}
		}
		return cars;
	}
}
