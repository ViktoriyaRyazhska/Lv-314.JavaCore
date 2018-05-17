import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	
	public Person (String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public int age() {
		return (LocalDate.now().getYear() - this.birthYear);
	}
	
	public void input() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter person's name");
		setName(reader.readLine());
		System.out.println("Enter person's birth year");
		setBirthYear(Integer.parseInt(reader.readLine()));
	}
	
	@Override
	public String toString() {
		return "Person " + name + ", birthYear = " + birthYear + ", age = " + age();
	}
	
	public String output() {
		return toString();
	}
	
	public void changeName(String newName) {
		setName(newName);
	}
	

}
