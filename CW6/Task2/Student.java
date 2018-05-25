package Task2;

public class Student extends Person {

	public String type_person;
	@Override
	public void print() {
		System.out.println("I am a student");

	}
	public Student(String type_person) {
		super(type_person);
		this.type_person = type_person;
	}

}
