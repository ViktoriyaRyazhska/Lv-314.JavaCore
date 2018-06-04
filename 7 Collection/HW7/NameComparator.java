import java.util.Comparator;

public class NameComparator implements Comparator<HW7_3Student> {

	@Override
	public int compare(HW7_3Student arg0, HW7_3Student arg1) {
		return ((HW7_3Student) arg0).getName().compareTo(((HW7_3Student) arg1).getName());

	}

}
