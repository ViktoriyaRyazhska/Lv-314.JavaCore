package H4;



/* class Dog with fields name, breed, age. 
Declare enum for field breed. 
Create 3 instances of type Dog. 
Check if there is no two dogs with the same name. 
Display the name and the kind of the oldest dog. 
*/
public class Dog {

	private String name;
	private Breed breed;
	private int age;

	public Dog() {

	}

	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static boolean compareName(Dog[] dogs) {
		boolean flag = true;
		for (int j = 0; j < dogs.length; j++)
			for (int i = j; i < dogs.length - 1; i++) {
				if (dogs[i + 1].getName().equals(dogs[j].getName())) {
					flag = false;
				}
			}
		return flag;

	}

	public static int oldestDog(Dog[] dogs) {
		int max = 0, index = 0;
		for (int i = 0; i < dogs.length; i++)
			if (dogs[i].getAge() > max) {
				max = dogs[i].getAge();
				index = i;
			}
		return index;
	}
}