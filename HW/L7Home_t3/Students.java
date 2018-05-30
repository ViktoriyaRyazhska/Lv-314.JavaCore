package L7Home_t3;

import java.util.Comparator;
import java.util.List;

public class Students {
	private String name;
	private Integer curs;

	public Students() {
	}

	public Students(String name, Integer curs) {
		super();
		this.name = name;
		this.curs = curs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCurs() {
		return curs;
	}

	public void setCurs(Integer curs) {
		this.curs = curs;
	}

	public static void printStudent(List<Students> students, Integer course) {
		for (Students itterator : students) {
			if (itterator.curs == course) {
				System.out.println("Name: " + itterator.name);
			}
		}
	}

	@Override
	public String toString() {
		return "[name=" + name + ", curs=" + curs + "]";
	}

	public static void sortByName(List<Students> students) {
		students.sort(new Comparator<Students>() {
			public int compare(Students a, Students b) {
				return a.name.compareTo(b.name);
			}
		});
	}

	public static void sortByCourse(List<Students> students) {
		students.sort(new Comparator<Students>() {
			public int compare(Students a, Students b) {
				return a.curs < b.curs ? -1 : 1;
			}
		});
	}

}
