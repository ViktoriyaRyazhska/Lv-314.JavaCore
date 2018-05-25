
public class Car {
	private String type;
	private int year;
	private float engine;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getEngine() {
		return engine;
	}

	public void setEngine(float engine) {
		this.engine = engine;
	}

	public Car() {

	}
	
	public Car(String type, int year, float engine) {
		this.type = type;
		this.year = year;
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return "Car (" + "type = '" + type + '\'' + ", year = " + year + ", engine = " + engine + ')';
	}
}
