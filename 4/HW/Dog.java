package hw4;

public class Dog {
	private String name;
	private breed breed;
	private int age;
	private static int oldest = 0;
	private static String oldestName = null;
	private static breed oldestBreed;

	public Dog(String name, breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		if (this.age >= oldest) {
			oldest = this.age;
			oldestName = this.name;
			oldestBreed = this.breed;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		if (this.age >= oldest) {
			oldest = this.age;
			oldestName = this.name;
			oldestBreed = this.breed;}
	}

	public breed getBreed() {
		return breed;
	}

	public void setBreed(breed breed) {
		this.breed = breed;
		if (this.age >= oldest) {
			oldest = this.age;
			oldestName = this.name;
			oldestBreed = this.breed;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		if (this.age >= oldest) {
			oldest = this.age;
			oldestName = this.name;
			oldestBreed = this.breed;
		}
	}

	public static int getOldest() {
		return oldest;
	}

	public static String getOldestName() {
		return oldestName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static breed getOldestBreed() {
		return oldestBreed;
	}

}
