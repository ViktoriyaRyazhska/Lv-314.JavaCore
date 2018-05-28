package _pasted_code1;


public class Cleaner extends Staff {
	private static  final  String TYPE_PERSON="Cleaner";
	public void print() {
		System.out.println("I am a cleaner");
	}
	@Override
	public void salary() {
		System.out.println("Cleaner's  salary 300");
	}
	public Cleaner() {
		super(name);
		System.out.println(Cleaner.TYPE_PERSON);
	}
	public Cleaner(String name) {
		super(name);
		System.out.println(Cleaner.TYPE_PERSON);
	}
	

}