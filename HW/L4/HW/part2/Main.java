package home2;

import java.io.IOException;

/*Ñreate class Dog with fields name, breed, age. 
Declare enum for field breed. 
Create 3 instances of type Dog. 
Check if there is no two dogs with the same name. 
Display the name and the kind of the oldest dog. 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Dog[] dogs = new Dog[3];
		dogs[0] = new Dog("Lucy", Breed.BRITTANY, 4);
		dogs[1] = new Dog("Sirko", Breed.CHOW_CHOW, 2);
		dogs[2] = new Dog("Wonderdog", Breed.BULLDOG, 7);
		System.out.println("Dogs have a unique name (" + Dog.compareName(dogs) + ") The oldest dog is "
				+ dogs[Dog.oldestDog(dogs)].getName());

	}
}
