import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	static Set<Integer> unionSet = new TreeSet<Integer>();
	static Set<Integer> intersetSet = new TreeSet<Integer>();
	static Map<String, String> personMap = new HashMap<>();

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<Integer>();
		Set<Integer> set2 = new TreeSet<Integer>();
		Random ran = new Random();

		for (int i = 0; i < 10; i++) {
			set1.add(ran.nextInt(20));
			set2.add(ran.nextInt(20));
		}
		System.out.println("Set 1 \n" + set1);
		System.out.println("Set 2 \n" + set2);
		union(set1, set2);
		intersect(set1, set2);
		System.out.println();

		soutMap(personMap);
		checkNameDuplicate(personMap);
		deleteNameFromMap(personMap);

		List<Student> students = new ArrayList<>();
		students.add(new Student("John", 1));
		students.add(new Student("Sam", 3));
		students.add(new Student("Bob", 2));
		students.add(new Student("Lenny", 1));
		students.add(new Student("Adam", 2));

		System.out.println();
		Student.printStudents(students, 1);

		System.out.println("\nSorting students by Course");
		Collections.sort(students);

		for (Student i : students) {
			System.out.println("Name: " + i.getName() + ", course: " + i.getCourse());
		}

		System.out.println("\nSorting students by Course");
		Collections.sort(students, new Student.SortName());

		for (Student i : students) {
			System.out.println("Name: " + i.getName() + ", course: " + i.getCourse());
		}
	}

	public static void union(Set set1, Set set2) {
		unionSet.addAll(set1);
		unionSet.addAll(set2);
		System.out.println("Union \n" + unionSet);

	}

	public static void intersect(Set set1, Set set2) {
		for (Object i : set1) {
			if (set2.contains(i)) {
				intersetSet.add((Integer) i);
			}
		}
		System.out.println("Intersection \n" + intersetSet);
	}

	public static void soutMap(Map<String, String> map) {
		personMap.put("Prizvushche1", "Sanya");
		personMap.put("Prizvushche2", "Vanya");
		personMap.put("Prizvushche3", "Orest");
		personMap.put("Prizvushche4", "Lyonya");
		personMap.put("Prizvushche5", "Evgen");
		personMap.put("Prizvushche6", "Ibrahim");
		personMap.put("Prizvushche7", "Boris");
		personMap.put("Prizvushche8", "Orest");
		personMap.put("Prizvushche9", "Eduard");
		personMap.put("Prizvushche10", "Herasim");

		for (Map.Entry<String, String> i : map.entrySet()) {
			System.out.println("Surname: " + i.getKey() + ", name: " + i.getValue());
		}
	}

	public static void checkNameDuplicate(Map<String, String> map) {
		Set<String> tSet = new TreeSet<>();
		tSet.addAll(personMap.values());

		if (map.size() == tSet.size()) {
			System.out.println("\nThere is no people with same first name.");
		} else {
			System.out.println("\nThere are people with same first name.");
		}
	}

	public static void deleteNameFromMap(Map<String, String> map) {
		String name = "Orest";
		System.out.println("\nRemoving people with name " + name);
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry i = (Entry) it.next();
			if (i.getValue().equals(name)) {
				it.remove();
			}
		}
		System.out.println();
		for (Map.Entry<String, String> i : map.entrySet()) {
			System.out.println("Surname: " + i.getKey() + ", name: " + i.getValue());
		}

	}
}
