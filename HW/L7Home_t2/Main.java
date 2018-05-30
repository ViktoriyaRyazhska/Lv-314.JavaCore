package L7Home_t2;

import java.util.HashMap;
import java.util.Map;

/*Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
Output the entities of the map on the screen. 
There are at less two persons with the same firstName among these 10 people?
Remove from the map person whose firstName is ”Orest” (or other). Print result.  */

public class Main {

	public static void main(String[] args) {
		Map<String, String> persons = new HashMap<String, String>();
		addTenPerson(persons);
		System.out.println(persons);
		System.out.println(isTheSameName(persons));
		deleteByFirstName(persons, "Petro");
		System.out.println(persons);
	}

	public static void addTenPerson(Map<String, String> persons) {
		persons.put("Ilkiv", "Petro");
		persons.put("Zotov", "Andrii");
		persons.put("Kladkow", "Andrii");
		persons.put("Denysjuk", "Vitalii");
		persons.put("Vitrovij", "Petro");
		persons.put("Galajczuk", "Olena");
		persons.put("Androszczuk", "Svitlana");
		persons.put("Bej", "Sergij");
		persons.put("Samijlo", "Oleg");
		persons.put("Viktoria", "Ryazhska");
	}

	// I dont know correct is it, but its work,
	// if I have enough time, I'll be back to this task
	public static boolean isTheSameName(Map<String, String> persons) {
		Map<String, String> personsTest = new HashMap<String, String>();
		personsTest.putAll(persons);
		int count_same_name = 0;
		String name = null;
		String key = null;
		boolean flag = true;
		while (flag) {
			for (Map.Entry<String, String> I : personsTest.entrySet()) {
				if (count_same_name == 0) {
					name = I.getValue();
					key = I.getKey();
					count_same_name++;

				} else if (I.getValue().equals(name)) {
					count_same_name++;
				}
				if (count_same_name > 1) {
					flag = false;
					break;
				}
			}
			if (flag == false) {
				break;
			}

			count_same_name = 0;
			if (personsTest.isEmpty()) {
				return false;
			} else {
				personsTest.remove(key);
			}
		}
		if (count_same_name > 1) {
			return true;
		} else {
			return false;
		}

	}*/

	public static void deleteByFirstName(Map<String, String> persons, String firstName) {

		while (persons.containsValue(firstName)) {
			for (Map.Entry<String, String> it : persons.entrySet()) {
				if (it.getValue().equals(firstName)) {
					persons.remove(it.getKey());
					break;
				}
			}
		}
	}

}
