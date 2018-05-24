package L6Class_t1;

public class Main {

	public static void main(String[] args) {
		Animal[] animal = new Animal[4];
		animal[0] = new Cat();
		animal[1] = new Dog();
		animal[2] = new Cat();
		animal[3] = new Dog();
		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i].voice());
			System.out.println(animal[i].feed());
		}

	}

}
