package lesson;

public class Dogs {
    
	public String name;
	public int age;
	public breed breed ;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public breed getBreed() {
		return breed;
	}
	public void setBreed(breed breed) {
		this.breed = breed;
	}
	
	public  Dogs (String name , int age , breed breed) {
		
		this.name = name ;
		this.age = age ;
		this.breed = breed ;
		
	}

	
	}
	
	

