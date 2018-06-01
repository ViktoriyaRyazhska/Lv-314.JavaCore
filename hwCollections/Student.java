package hwCollections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
	
}
class CourseComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getCourse() -o2.getCourse();
	}
	
	
}
public class Student  {
	
	private String name;
	private int course;
	private static NameComparator nameCompararor=new NameComparator();
	private static CourseComparator courseComparator =new CourseComparator();
	
	

	public static NameComparator getNameCompararor() {
		return nameCompararor;
	}

	public static CourseComparator getCourseComparator() {
		return courseComparator;
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

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	


	public static void printStudent(List <Student> students,Integer course ) {
		
		for (Iterator<Student> iterator= students.iterator(); iterator.hasNext();){
			Student stud=(Student)iterator.next();
			if (stud.course==course) {
				System.out.println(stud.name);
			}
			
		}
	}
	

}
