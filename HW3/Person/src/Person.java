import java.util.Calendar;
public class Person {
	private String name;
	private int year;
	Calendar calendar = Calendar.getInstance();
	int curYear = calendar.get(Calendar.YEAR);
	
	//Contructors
	public Person() {
		}
	public Person(String name, int year) {
			this.name = name;
			this.year = year;
	}
	
	//Methods
	public int age () {
		return curYear-year;
	}
	public void input(String name, int year) {
		changeName (name);
		setYear (year);
	}
	public void output() {
		System.out.println("Name="+getName()+" Year="+getYear()+" Age="+age());	
	}
	
	//GET SET
	public String getName() {
		return name;
	}
	public void changeName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", year=" + year + "]";
	}
	
	
	
}
