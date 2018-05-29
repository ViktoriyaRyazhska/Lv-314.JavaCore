import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class pt_1 {
	static ArrayList<Integer> newCollection = new ArrayList<>();
	static ArrayList<Integer> myCollection = new ArrayList<Integer>();

	public static void createNew() {

		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 5) {
				newCollection.add(i);
			}
		}
		System.out.println("\nCreated newCollection with all positions of element more than 5 in the collection.");
		System.out.println(newCollection);

	}

	public static void creatyMy() {

		for (int i = 0; i < 10; i++) {
			myCollection.add((int) (Math.random() * 40 - 10));
		}
		System.out.println("\nCreated myCollection with random integers");
		System.out.println(myCollection);
	}

	public static void removeFromMy() {
		Iterator<Integer> it = myCollection.iterator();
		while (it.hasNext()) {
			if (it.next() > 20) {
				it.remove();
			}
		}
		System.out.println("\nRemoving from collection myCollection elements, which are greater then 20.");
		System.out.println(myCollection);
	}

	public static void insertThree() {
		System.out.println("\nInserting elements 1, -3, -4 in positions 2, 8, 5.");
		if (myCollection.size() > 8) {
			myCollection.set(2, 1);
			myCollection.set(8, -3);
			myCollection.set(5, -4);
			
			for (int i = 0; i < myCollection.size(); i++) {
				System.out.println("Position - " + i + ", value of element - " + myCollection.get(i));
			}
		} else {
			System.out.println("\nArray is lesser than 8 elements");
		}
	}
	
	public static void sort() {
		System.out.println("\nSorting myCollection");
		Collections.sort(myCollection);
		System.out.println(myCollection);
	}
}
