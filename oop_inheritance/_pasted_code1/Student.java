package _pasted_code1;

public class Student extends Person {
	public final static String TYPE_PERSON = "Student";

	@Override
	void print() {
		System.out.println("I am Student");

	}

	public Student(String name) {
		super();
		Person.name = name;
		System.out.println(Student.TYPE_PERSON);
	}

	public Student() {
		super();
		System.out.println(Student.TYPE_PERSON);
	}
	@Override
	public void salary() {
		System.out.println("Cleaner's  salary 300");
}
}
