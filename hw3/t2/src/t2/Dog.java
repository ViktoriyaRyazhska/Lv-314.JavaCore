package t2;

public class Dog {
	private String name;
	private Breed breed;
	private int age;
	
	public Dog() {
	}

	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	
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
	public static Dog oldest(Dog[] dog) {
		Dog old = dog[0];
//		for(int i = 1; i<dog.length;i++) {
//			if (dog[i].getAge()> old.getAge()) {
//				old = dog[i];
//			}
//		}
		
		for(Dog d: dog) {
			if (d.getAge()> old.getAge()) {
				old = d;
			}
		}
		return old;
	}
	}

