package L7Class_t1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*Declare collection myCollection of 10 integers and fill it (from the console or random).
Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
Remove from collection myCollection elements, which are greater then 20. Print result
Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
Sort and print collection 
Use next Collections for this tasks: List, ArrayList, LinkedList*/
public class Main {

	public static void main(String[] args) {
		List<Integer> myCollection = new ArrayList<Integer>();
		List<Integer> elements = new ArrayList<Integer>();
		List<Integer> positions = new ArrayList<Integer>();

		elements.add(1);
		elements.add(-3);
		elements.add(-4);
		positions.add(2);
		positions.add(8);
		positions.add(5);
		System.out.println("Generate Array:" + generateArray(myCollection, 10, 100));
		System.out.println("More FIVE:" + moreNumberReturn(myCollection, 5));
		System.out.println("Insert Elements" + insertElements(myCollection, elements, positions));
		System.out.println("More Twenty:" + moreNumberDelete(myCollection, 20));
		Collections.sort(myCollection);
		System.out.println("Sorted:" + myCollection);

	}

	/* Random Number Generator */
	public static List<Integer> generateArray(List<Integer> myCollection, int size_array, int range) {
		for (int i = 0; i < size_array; i++) {
			myCollection.add(new Random().nextInt(range));
		}
		return myCollection;
	}

	/* Returns all numbers greater than "number" */
	public static List<Integer> moreNumberReturn(List<Integer> myCollection, int number) {
		List<Integer> positionMoreFive = new ArrayList<Integer>();
		for (Integer it : myCollection) {
			if (it > number) {
				positionMoreFive.add(it);
			}
		}
		return positionMoreFive;
	}

	/* Delete all numbers greater than "number" */
	public static List<Integer> moreNumberDelete(List<Integer> myCollection, int number) {
		List<Integer> numbersMoreTwenty = new ArrayList<Integer>();
		for (Integer it : myCollection) {
			if (it > number) {
				numbersMoreTwenty.add(it);
			}
		}
		myCollection.removeAll(numbersMoreTwenty);
		return myCollection;
	}

	/*
	 * The first argument is a collection in which we will overwrite the data. The
	 * second argument is the data we will overwrite. The third argument is the
	 * position in which we will record the data
	 */
	public static List<Integer> insertElements(List<Integer> myCollection, List<Integer> whatReplace,
			List<Integer> indexReplace) {
		for (int i = 0; i < smalestLength(whatReplace, indexReplace); i++)
			myCollection.set(indexReplace.get(i), whatReplace.get(i));
		return myCollection;
	}

	/*
	 * This function returns the smallest array length among the two given. P.S. It
	 * is made to evenly overwrite the collection
	 */
	private static int smalestLength(List<Integer> a, List<Integer> b) {
		if (a.size() < b.size())
			return a.size();
		else
			return b.size();
	}

}
