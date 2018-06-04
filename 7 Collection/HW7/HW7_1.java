import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class HW7_1 {

	public static void main(String[] args) {
		// Write parameterized methods union(Set set1, Set set2) and intersect(Set set1,
		// Set set2),
		// realizing the operations of union and intersection of two sets.
		// Test the operation of these techniques on two pre-filled sets.
		Random rand;
		rand = new Random();
		int size = rand.nextInt(20);
		

		Set<Integer> set1 = new TreeSet<Integer>();
		Set<Integer> set2 = new TreeSet<Integer>();

		fulfill(size, set1);
		fulfill(size, set2);
		System.out.println("set1="+set1);
		System.out.println("set2="+set2);
		union(set1, set2);
		System.out.println("Union="+set1);
		
		
		//intersect(set1, set2);
		System.out.println();
		fulfill(size, set1);
		fulfill(size, set2);
		System.out.println("set1="+set1);
		System.out.println("set2="+set2);
		intersect(set1, set2);
		System.out.println("intersect...="+set1);
	
		
	}

	private static void union(Set<Integer> set1, Set<Integer> set2) {
		set1.addAll(set2);
	}

	private static void intersect(Set<Integer> set1, Set<Integer> set2) {
		set1.retainAll(set2);
	}

	private static void fulfill(int size, Set<Integer> set1) {
		Random rand;
		set1.clear();
		for (int i = 0; i < size; i++) {
			rand = new Random();
			int element = rand.nextInt(20);
			set1.add(element);
		}
	}

}
