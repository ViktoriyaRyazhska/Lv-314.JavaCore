
public class Person {
	private String name;
	private short  birthYear;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public short getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(short birthYear) {
		this.birthYear = birthYear;
	}
	public Person () {}
	public Person(String name , short birthYear) {
		this.name=name;
		this.birthYear=birthYear;
		}
	public short age () {
		short correntYear=2018;
		return (short) (correntYear-this.getBirthYear());
		
	}
	public void input (String name , short birthYear) {
		this.setName(name);
		this.setBirthYear(birthYear);
	}

	public void changeName(String name) {
		this.setName(name);
	}

	public void output() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return ("The name of a person is " + this.getName() + " His age is " + this.age());
	}
    public static void  main (String[] args) {
    	Person student = new Person("Stanislav",(short)1995);
    	Person teacher = new Person("name2", (short)1882);
    	Person dustman = new Person();
    	Person plumber = new Person();
    	Person emploee = new Person();
   
    	dustman.input("name3", (short)1888);
    	plumber.input("name4", (short)1996);
    	emploee.input("name5", (short)1865);
    	
    	student.output();
    	teacher.output();
    	dustman.output();
    	plumber.output(); 
    	emploee.output();
    }
}
