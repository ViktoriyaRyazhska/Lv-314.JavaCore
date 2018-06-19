import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
	public static void task4(String str) {
		int n = 0;
		List<String> chars = Arrays.asList(str.split(""));
		List<String> loud = new ArrayList<String>(Arrays.asList("a", "e", "i", "o", "u", "y"));
		for (String c : chars) {
			if (loud.contains(c)) {
				n++;
			}
		}
		System.out.println("Quantity of loud letters is " + n + ".");
	}
}
