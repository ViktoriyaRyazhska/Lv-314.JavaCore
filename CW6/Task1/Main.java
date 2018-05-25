package Task1;

public class Main {

	public static void main(String[] args) {
		Animal[] an = new Animal[2];
		an[0] = new Cat();
		an[1] = new Dog();
		
		for (int i = 0; i < an.length; i++) {
			an[i].feed();
			an[i].voice();
		}
	}

}
