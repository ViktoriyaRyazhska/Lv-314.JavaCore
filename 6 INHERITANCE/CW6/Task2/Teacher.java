package Task2;

public class Teacher extends Staff {
	public  String type_person;
	
	public Teacher(String type_person) {
		super(type_person);
		this.type_person = type_person;
	}
	@Override
	public void Salary() {
		System.out.println("Salary teacher");

	}

	@Override
	public void print() {
		System.out.println("I am a teacher");
	}

}
