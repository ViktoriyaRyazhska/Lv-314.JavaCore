
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HW7_2 {

	public static void main(String[] args) {
		// // Create map personMap and add to it ten persons of type <String, String>
		// (lastName, firstName).
		// Output the entities of the map on the screen.
		// There are at less two persons with the same firstName among these 10 people?
		// Remove from the map person whose firstName is ”Orest” (or other). Print
		// result.

		Map<String, String> personMap = new TreeMap<String, String>();
		personMap.put("first", "Vova");
		personMap.put("second", "Ira");
		personMap.put("third", "Sara");
		personMap.put("fourh", "Gala");
		personMap.put("5th", "Nasta");
		personMap.put("6th", "Oleg");
		personMap.put("7th", "Sad");
		personMap.put("8th", "Vova");
		personMap.put("9th", "Nazar");
		personMap.put("10th", "Orest");

		output(personMap);

		List<String> names = new ArrayList<String>();
		names.addAll(personMap.values());

		sameNames(names);

		// Remove from the map person whose firstName is ”Orest” (or other)
		String removeName = "Orest";
		while (personMap.containsValue(removeName)) {
			for (Map.Entry<String, String> entry : personMap.entrySet()) {
				if (entry.getValue().equals(removeName)) {
					personMap.remove(entry.getKey());
					break;
				}
			}
		}
		System.out.println(personMap);

	}

	private static void output(Map<String, String> personMap) {
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	private static void sameNames(List<String> names) {
		for (int i = 0; i < names.size(); i++) {
			int c = Collections.frequency(names, names.get(i));
			if (c > 1) {
				System.out.println("There are at less two persons with the same firstName");
				break;
			}
		}
	}

}
