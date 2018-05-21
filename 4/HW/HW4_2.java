package hw4;

public class HW4_2 {

	public static void main(String[] args) {

		Dog d1 = new Dog("Gav", breed.DOBERMAN, 2);
		Dog d2 = new Dog("Vat", breed.POODLE, 10);
		Dog d3 = new Dog("Tera", breed.COOLIE, 6);
//Equals name:
		if (d1.equals(d2) || d2.equals(d3) || d3.equals(d1)) {
			System.out.println("there are two dogs with the same name.");
		} else {
			System.out.println("there is no dogs with the same name.");
		}
		System.out.println();
	
//Oldest dog:
		System.out.println("the oldest dog is: "+Dog.getOldestName()+". His breed is: "+Dog.getOldestBreed());	
				
	
	}
}