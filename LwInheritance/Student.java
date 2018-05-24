package LwInheritance;

public class Student extends Person {

	public static final String TYPE_PERSON = "Student";

	@Override
	void print() {
		System.out.println("I am a student");

	}

	public Student(String name) {
		super();
		this.name = name;
		System.out.println(Student.TYPE_PERSON);
	}

	public Student() {
		super();
		System.out.println(Student.TYPE_PERSON);
	}
	

}
