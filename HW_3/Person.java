import java.time.LocalDate;

public class Person {
	
	private static int age=0;
	
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
	
	public Person() {}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public int age() {
		if(this.birthYear!=0)
		return (LocalDate.now().getYear()-this.birthYear);
		
		else
			return 0;
	}
	
	public String output() {
		return "Name - "+this.name+", birthday year - "+this.birthYear+", age - "+age();
	}
	
	public void intput (String name, int birthYear) {
		this.name=name;
		this.birthYear=birthYear;
	}
	
	public void changeName (String name) {
		this.name=name;
	}
	
	

}
