package L6Class_t2;

public class Teacher extends Staff {
	final private String TYPE_PERSON = "Teacher";

	Teacher() {
		System.out.println(TYPE_PERSON);
	}

	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}

	@Override
	public void print() {
		System.out.print("I am " + this.TYPE_PERSON);

	}

	@Override
	public float salary() {
		return 2800.45f;
	}

}
