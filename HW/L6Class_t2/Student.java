package L6Class_t2;

public class Student extends Person {
	final private String TYPE_PERSON = "Student";

	Student() {
		System.out.println(TYPE_PERSON);
	}

	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}

	@Override
	public void print() {
		System.out.print("I am " + this.TYPE_PERSON);

	}
}
