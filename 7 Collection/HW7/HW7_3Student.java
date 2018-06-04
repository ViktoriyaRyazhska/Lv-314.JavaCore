import java.util.Iterator;
import java.util.List;

public class HW7_3Student {

	String name;
	int course;

	public HW7_3Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public static NameComparator getNameComparator() {
		return nameComparator;
	}

	public static CourseComparator getCourseComparator() {
		return CourseComparator;
	}

	static NameComparator nameComparator = new NameComparator();

	static CourseComparator CourseComparator = new CourseComparator();

	public static void printStudents(List<HW7_3Student> students, int group) {
		Iterator<HW7_3Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			HW7_3Student element = (HW7_3Student) iterator.next();
			if (element.getCourse() == group) {
				System.out.println(element);
			}
		}
	}

	@Override
	public String toString() {
		return "Student name " + name + ", course " + course + "";
	}

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

}
