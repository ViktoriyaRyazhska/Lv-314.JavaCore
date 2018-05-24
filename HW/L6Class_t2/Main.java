package L6Class_t2;

public class Main {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		// constructors
		persons[0] = new Student();
		persons[1] = new Teacher();
		persons[2] = new Cleaner();
		// Print who they
		System.out.println();
		showArrayObject(persons);

	}

	// Display array objects
	public static void showArrayObject(Person[] persons) {
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Staff) {
				persons[i].print();
				System.out.println(" i have " + ((Staff) persons[i]).salary());
			} else {
				persons[i].print();
				System.out.println();
			}
		}

	}
}
