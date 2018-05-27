public class Cleaner extends Staff{

	final private String TYPE_PERSON="Cleaner";
	
	@Override
	public void print() {
		System.out.println("I am a cleaner");
	}
	
	
	@Override
	public void salary(int s) {
		System.out.println("I am a cleaner  " + s);
	}
	
	
}
