package t1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.io.IOException;

public class Person {
	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private String name;
	private int year;

	public Person() {

	}

	public Person(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}
	public void changeName ()throws IOException {
		System.out.println("¬ведите новое »м€");
		setName (br.readLine());
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int age() {
		return LocalDate.now().getYear() - this.year;

	}

	public void input() throws IOException {
		System.out.println("¬ведите им€");
		setName(br.readLine());
		System.out.println("¬ведите год рождени€");
		setYear(Integer.parseInt(br.readLine()));
	}

	public String output() {
		return this.getName() + "ему" + this.age() + "лет";
	}

	@Override
	public String toString() {
		return "Person(name=" + name + ", year=" + year + ")";
	}

}