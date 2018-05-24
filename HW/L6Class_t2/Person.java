package L6Class_t2;

public abstract class Person {
	private String name;

	abstract public void print();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
	}

	public Person(String name) {
		super();
		this.name = name;
	}

}
