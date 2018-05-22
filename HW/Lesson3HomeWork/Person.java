import java.time.LocalDate;


public class Person {
	private String name;
	private int birthYear;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public Person() {		
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public int age() {
		return LocalDate.now().getYear() - this.birthYear;
	}
	public void input(String name,short birhYear) {
		this.name = name;
		this.birthYear = birhYear;
	}
	public void output() {
		System.out.println("Name:" + this.name + " age:" + this.age() );
	}
	public void changeName(String name) {
		this.name = name;
	}
}
