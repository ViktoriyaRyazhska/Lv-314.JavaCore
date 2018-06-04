import java.util.Comparator;

public class CourseComparator implements Comparator<HW7_3Student> {

	@Override
	public int compare(HW7_3Student arg0, HW7_3Student arg1) {
		return ((HW7_3Student) arg0).getCourse() - ((HW7_3Student) arg1).getCourse();

	}

}