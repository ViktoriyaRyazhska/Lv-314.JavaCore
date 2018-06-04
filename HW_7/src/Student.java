import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {
	private String name;
	private int course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Student() {
	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public static void printStudents(List<Student> list, Integer course) {
		// Iterator<Student> it = list.iterator();
		// while (it.hasNext()) {
		// if (it.next().getCourse() == course) {
		// System.out.println(it);
		// }
		// }

		for (Student st : list) {
			if (st.getCourse() == course) {
				System.out.println(st);
			}
		}
	}

	@Override
	public String toString() {
		return "Student: Name = " + name + ", course - " + course;
	}

	static class SortName implements Comparator<Student> {
		@Override
		public int compare(Student a, Student b) {
			return a.getName().compareTo(b.getName());
		}
	}

	@Override
	public int compareTo(Student a) {
		return Integer.compare(course, a.getCourse());
	}
}
