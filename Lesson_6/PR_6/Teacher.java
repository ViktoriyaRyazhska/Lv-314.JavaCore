public class Teacher extends Staff{
	
	final private String TYPE_PERSON="Teacher";
	
	@Override
	public void print() {
		System.out.println("I am a teacher");
	}
	
	
	@Override
	public void salary(int s) {
		System.out.println("I am a teacher  " + s);
	}
	
	
}
