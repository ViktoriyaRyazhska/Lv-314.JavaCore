import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Person person1 = new Person("Mark", 1990);
		Person person2 = new Person("Penny", 1988);
		Person person3 = new Person("Jack", 1992);
		Person person4 = new Person("Molly", 1995);
		Person person5 = new Person("Mike", 1989);
		
		System.out.println(person1.output());
		System.out.println();
		person1.changeName("Bob");
		
		System.out.println(person1.output());
		System.out.println(person2.output());
		System.out.println(person3.output());
		System.out.println(person4.output());
		System.out.println(person5.output());
		
		System.out.println();
		person5.input();
		
		System.out.println(person5.output());
		
	}

}
