import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CW1 {

	public static void main(String[] args) {
		// Declare collection myCollection of 10 integers
		List<Integer> myCollection = new ArrayList<Integer>();
		Random rand;
		int sizearr = 10;

		// Writing random 10 digits
		for (int i = 0; i < sizearr; i++) {
			rand = new Random();
			int element = rand.nextInt(25);
			myCollection.add(i, element);
		}
		System.out.print("Random collection:  ");
		printCollection(myCollection);
		
		// Find and save in list newCollection all positions of element more than 5 in
		// the collection.
		// Print newCollection

		List<Integer> newCollection = new ArrayList<Integer>(); // >5
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 5) {
				newCollection.add(myCollection.get(i));
			}
		}
		System.out.println();
		System.out.print("collection >5:     ");

		printCollection(newCollection);

		// Remove from collection myCollection elements, which are greater then 20.
		// Print result
		System.out.println();
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 20) {
				myCollection.remove(i);
				i--;
			}
		}
		System.out.print("coll. without >20: ");
		printCollection(myCollection);
		System.out.println();
		
		// Insert elements 1, -3, -4 in positions 2, 8, 5.
		// Print result in the format: “position – xxx, value of element – xxx”
		if (myCollection.size() >= 8) {
			myCollection.remove(1);
			myCollection.add(1, 1);

			myCollection.remove(7);
			myCollection.add(7, -3);

			myCollection.remove(4);
			myCollection.add(4, -4);
		} else
			System.out.println("Can not insert values");

		System.out.println();
		System.out.println("after inserting=   ");
		for (int i = 0; i < myCollection.size(); i++) {
			System.out.println("Index =" + (i + 1) + " Value=" + myCollection.get(i));
		}

		// Sort and print collection
		Collections.sort(myCollection);
		System.out.print("Sorted collection: ");
		printCollection(myCollection);

	}

	private static void printCollection(List<Integer> myCollection) {
		for (Iterator<Integer> iterator = myCollection.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(" " + integer);
		}
	}

}