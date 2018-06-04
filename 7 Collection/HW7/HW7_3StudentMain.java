import java.util.ArrayList;
import java.util.List;

public class HW7_3StudentMain {

	public static void main(String[] args) {

		List<HW7_3Student> students = new ArrayList<HW7_3Student>();
		students.add(new HW7_3Student("Vova", 314));
		students.add(new HW7_3Student("Ira", 314));
		students.add(new HW7_3Student("Oleg", 214));
		students.add(new HW7_3Student("Nazar", 214));
		students.add(new HW7_3Student("Vova", 414));

		int group = 214;

		HW7_3Student.printStudents(students, group);

		students.sort(new NameComparator());
		System.out.println(students);

		students.sort(new CourseComparator());
		System.out.println(students);

		
	}

}
