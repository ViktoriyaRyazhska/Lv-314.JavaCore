
public class Dog {
	
	private String name;
	private Breed breed; 
	private int age;
	
	private static Breed oldestDogKind;
	private static int oldestDogAge; 
	
	
	public Dog(String name, Breed breed, int age) {
		super();
		if (age>oldestDogAge ) {
			oldestDogAge=age;
			oldestDogKind=breed;
		}
		this.name = name;
		this.breed = breed;
		this.age = age;
	}


	public static Breed getOldestDogKind() {
		return oldestDogKind;
	}


	public static int getOldestDogAge() {
		return oldestDogAge;
	}

}
