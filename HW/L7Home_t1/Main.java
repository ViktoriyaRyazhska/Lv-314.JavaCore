package L7Home_t1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
 *  realizing the operations of union and intersection of two sets. 
 *  Test the operation of these techniques on two pre-filled sets. 
*/
public class Main {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		generator(set1, 10, 10);
		generator(set2, 10, 10);
		intersection(set1, set2);
		union(set1, set2);

	}

	public static void generator(Set<Integer> set, int size, int range) {
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			set.add(random.nextInt(range));
		}
	}

	public static void union(Set<Integer> set1, Set<Integer> set2) {
		set1.addAll(set2);
		System.out.println(set1);
	}

	public static void intersection(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set3 = new HashSet<Integer>();
		for (Integer I : set1) {
			if (set2.contains(I)) {
				set3.add(I);
			}
		}
		System.out.println(set3);
	}
}
