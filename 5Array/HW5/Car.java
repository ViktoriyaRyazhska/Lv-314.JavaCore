
public class Car {

	private String type;
	private int year;
	private float engine;

	public Car(String type, int year, float engine) {
		this.type = type;
		this.year = year;
		this.engine = engine;
	}

	public static void modelYear(Car[] p, int year) {
		int count =0;
		for (int i = 0; i < p.length; i++) {
			if (p[i].getYear() == year) {
				System.out.println(p[i]);
				count++;
			}
		}
		if (count==0) {
			System.out.println("Found nothing of "+year+" year.");
		}
	}

	public static void sortYear(Car[] p) {
		Car tmp;
		for (int i = 0; i < p.length - 1; i++) {
			for (int j = i + 1; j < p.length; j++) {
				if (p[i].getYear() > p[j].getYear()) {
					tmp = p[i];
					p[i] = p[j];
					p[j] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorting car by year...");
		for (int i11 = 0; i11 < p.length; i11++) {
			System.out.println(p[i11]);
		}
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(engine);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (Float.floatToIntBits(engine) != Float.floatToIntBits(other.engine))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", engine=" + engine + "]";
	}

}
