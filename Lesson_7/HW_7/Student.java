import java.util.Iterator;
import java.util.List;

public class Student {
	private int course;
	private String name;
	
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(int course, String name) {
		this.course = course;
		this.name = name;
	} 
	
	public static void printStudents (List students, Integer course){
		
		for(int i=0; i<students.size(); i++){
			if(((Student) students.get(i)).getCourse()==course){
				System.out.println("Name - "+((Student) students.get(i)).getName()+", course - "+((Student) students.get(i)).getCourse());
			}
	//		System.out.println("Name - "+((Student) students.get(i)).getName()+", course - "+((Student) students.get(i)).getCourse());
		}
	}
	
	public static void printStudents (List students, String name){
		
		for(int i=0; i<students.size(); i++){
			if(((Student) students.get(i)).getName().equals(name)){
				System.out.println("Name - "+((Student) students.get(i)).getName()+", course - "+((Student) students.get(i)).getCourse());
			}
		}
	}
	
}
