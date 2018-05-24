package L6Home_t1;

public class Main {

	public static void main(String[] args) {
		// Create array with Birds
		Bird[] birds = new Bird[4];
		birds[0] = new Eagle();
		birds[1] = new Swallow();
		birds[2] = new Penguin();
		birds[3] = new Chicken();
		showArrayObject(birds);

	}

	// Display array objects
	public static void showArrayObject(Bird[] birds) {
		for (int i = 0; i < birds.length; i++) {

			System.out.println("Can fly? "+birds[i].fly()+" Lay e");

		}

	}
}
