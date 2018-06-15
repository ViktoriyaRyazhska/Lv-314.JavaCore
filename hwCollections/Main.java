package hwCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void printSet(Set<Integer> set) {
		for (Integer intValue : set) {
			System.out.println(intValue);
		}
		System.out.println();
	}

	public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
	
		Set<Integer> intersectionSet = new TreeSet();
		intersectionSet.addAll(set1);
		intersectionSet.retainAll(set2);
		return intersectionSet;

	}

	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> unionSet = new TreeSet();

		unionSet.addAll(set1);

		unionSet.addAll(set2);

		return unionSet;
	}

	public static void main(String[] arg) {
		Set<Integer> set1 = new TreeSet();
		Set<Integer> set2 = new TreeSet();
		set1.add(41);
		set1.add(34);
		set1.add(45);

		set2.add(53);
		set2.add(76);
		set2.add(45);
		set2.add(41);
        System.out.println("set1 :");
		Main.printSet(set1);
		System.out.println("set2 :");
		Main.printSet(set2);
		System.out.println("intersection of sets :");
		Main.printSet(Main.intersection(set1, set2));
		System.out.println("union of sets :");
		Main.printSet(Main.union(set1, set2));
		Map<String, String> personMap = new TreeMap();

		personMap.put("Kuslutskiy", "Roman");
		personMap.put("Boiko", "Ira");
		personMap.put("Martunenko", "Yura");
		personMap.put("Kudrya", "Ira");
		personMap.put("Legkhuy", "Ivan");
		personMap.put("Zhadorozhiny", "Maxym");
		personMap.put("Dubchenko", "Evgen");
		personMap.put("Grigoreva", "Kateruna");
		personMap.put("Ivanenko", "Ivan");

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

		List<Student> studentList = new ArrayList();
		studentList.add(new Student("Stanislav", 3));
		studentList.add(new Student("Yura", 4));
		studentList.add(new Student("Igor", 3));
		studentList.add(new Student("Yaroslav", 3));
		studentList.add(new Student("Vyacheslav", 5));
		studentList.sort(Student.getCourseComparator());

		
		/*  for( Iterator<Student> iter=studentList.iterator();iter.hasNext();){
		  System.out.println(iter.next().getName()+" "+iter.next().getCourse() );
		  
		  }*/
		 

		for (Student stud : studentList) {
			System.out.println(stud.getName() + " " + stud.getCourse());

		}

		studentList.sort(Student.getNameCompararor());
		System.out.println();

		for (Student stud : studentList) {
			System.out.println(stud.getName() + " " + stud.getCourse());

		}

	}

}
