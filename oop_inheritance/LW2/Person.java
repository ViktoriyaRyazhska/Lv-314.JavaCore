package _pasted_code1;

public abstract class Person {
	public static String name;

	public Person() {
	}

	public Person(String name) {
		
		Person.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Person.name = name;
	}

	abstract void print();

}
