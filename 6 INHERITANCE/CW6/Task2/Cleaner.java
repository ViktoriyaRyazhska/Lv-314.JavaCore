package Task2;

public class Cleaner extends Staff {
	public String type_person;

	public Cleaner(String type_person) {
		super(type_person);
		this.type_person = type_person;
	}

	@Override
	public void Salary() {
		System.out.println("salary Cleaner");

	}

	@Override
	public void print() {
		System.out.println("I am a cleaner");
	}

}
