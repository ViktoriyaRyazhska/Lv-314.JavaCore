package L6Class_t2;

public class Cleaner extends Staff {
	final private String TYPE_PERSON = "Cleaner";

	Cleaner() {
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
		return 1504.4f;
	}
}
