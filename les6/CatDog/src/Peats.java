import javax.swing.SortingFocusTraversalPolicy;

public class Peats {

	public static void main(String[] args) {
		Animal[] animal = new Animal[4];
		animal[0] = new cat();
		animal[1] = new dog();
		animal[2] = new cat();
		animal[3] = new dog();
		for (int i = 0; i < animal.length; i++) {
			animal[i].feed();
			animal[i].voice();
		}

	}

}
