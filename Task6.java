import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
	public static void task6(String str) {
		List<String> list = Arrays.asList(str.split(" "));
		System.out.println("There is " + list.size() + " words in the text.");
		
	}
}
