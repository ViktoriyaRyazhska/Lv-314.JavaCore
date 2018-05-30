import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
	public static void main(String[] args) throws IOException {

														//1
		/*
		Methods metod = new Methods();
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(4);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		System.out.println(metod.intersect(set1, set2));
		System.out.println(metod.union(set1, set2));
		System.out.println(metod.intersect(set1, set2));
		System.out.println(metod.union(set1, set2));
		*/
		
														//2
		/*
		Map <String, String> personMap = new HashMap <String, String> ();
		personMap.put("Mitnick", "Kevin");
		personMap.put("Torvalds", "Linus");
		personMap.put("Dell", "Michael");
		personMap.put("Zuckerberg", "Mark");
		personMap.put("Assange", "Julian");
		personMap.put("Gates", "Bill");
		personMap.put("Mack", "Ilon");
		personMap.put("Hokin", "Stiven");
		personMap.put("King", "Stephen");
		personMap.put("Hart", "Kevin");
		
		String value = "Kevin";
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
		    System.out.println("Lastname - "+entry.getKey() + ", Firstname - "+ entry.getValue());
		}
		 // ??????????????
		*/
		
		
														//3
		
		BufferedReader b_reader = new BufferedReader(new InputStreamReader(System.in));
		
		List <Student> list_student = new ArrayList<Student>();
		list_student.add(new Student(1, "Lincoln"));
		list_student.add(new Student(2, "Clark"));
		list_student.add(new Student(3, "Lincoln"));
		list_student.add(new Student(4, "Edvart"));
		list_student.add(new Student(4, "Tom"));
		
		Student.printStudents(list_student,Integer.parseInt(b_reader.readLine()));
		Student.printStudents(list_student,b_reader.readLine());
		
		
		
		
		
		
	}

}
