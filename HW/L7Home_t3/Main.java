package L7Home_t3;

import java.util.ArrayList;
import java.util.List;

/*Write class Student that provides information about the name of the student and his course. 
 * Class Student should consists of
properties for access to these fields
constructor with parameters
method printStudents (List students, Integer course), 
which receives a list of students and the course number and prints to the console the names of the students from the list, 
which are taught in this course (use an iterator)
methods to compare students by name and by course
In the main() method 
declare List students and add to the list five different students
display the list of students ordered by name
display the list of students ordered by course.*/

public class Main {

	public static void main(String[] args) {
List<Students> students = new ArrayList<Students>();
students.add(new Students("Petro",4));
	}

}
