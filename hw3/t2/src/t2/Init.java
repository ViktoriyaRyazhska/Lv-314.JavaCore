package t2;

public class Init {

	

	public static void main(String[] args) {
	    Dog [] dog = new Dog [3];
		dog [0] = new Dog("Lesli",Breed.TAKSA,5);
		dog [1] = new Dog("Tor",Breed.DOG,3);
		dog [2] = new Dog("Shurik",Breed.BULDOG,7);
		if (dog[0].equals(dog[1]) || dog[1].equals(dog[2]) || dog[2].equals(dog[0])) {
			System.out.println("there are two dogs with the same name.");
		} else {
			System.out.println("there is no dogs with the same name.");
		}
		System.out.println("The oldest dog name is " + Dog.oldest(dog).getName() );
	}

}
