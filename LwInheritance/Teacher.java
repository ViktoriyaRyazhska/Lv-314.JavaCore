package LwInheritance;

public class Teacher extends Staff {
  private static  final  String TYPE_PERSON="Teacher";
  
	public void print() {
		System.out.println("I am a teacher");
	}
	@Override
	public void salary() {
		System.out.println("Teacher's salary 200");		
	}
	
	public Teacher() {
		super();
		System.out.println(Teacher.TYPE_PERSON);
	}
	public Teacher(String name) {
		super(name);
		System.out.println(Teacher.TYPE_PERSON);
	}
   
}
