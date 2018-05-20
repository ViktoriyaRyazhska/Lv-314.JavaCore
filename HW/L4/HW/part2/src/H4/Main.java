package H4;


import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

/* class Dog with fields name, breed, age. 
Declare enum for field breed. 
Create 3 instances of type Dog. 
Check if there is no two dogs with the same name. 
Display the name and the kind of the oldest dog. 
*/
public class Main {
	public static void main(String[] args) throws IOException {
			
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Lucy", Breed.BRITTANY, 4));
		dogs.add(new Dog("Sirko", Breed.CHOW_CHOW, 2));
		dogs.add(new Dog("Wonderdog", Breed.BULLDOG, 7));
		
		System.out.println("Dogs have a unique name? (" + Dog.compareName(dogs) + ") The oldest dog is "
				+ dogs.get(Dog.oldestDog(dogs)).getName());
		


	}
}