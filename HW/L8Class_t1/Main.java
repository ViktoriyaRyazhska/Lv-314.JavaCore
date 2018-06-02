package L8Class_t1;

/*Enter surname, name and patronymic on the console as a variable of type String. 
 * Output on the console:
	surnames and initials
	name
	name, middle name and last name
*/
public class Main {
	public static void main(String[] args) {
		String s = "Ilkiv Petro Volodimirovicz";
		requestToMyString(s, 1);// show surname and initials
		requestToMyString(s, 2);// show name
		requestToMyString(s, 3);// show name middle name last name
	}

	public static void requestToMyString(String s, int request) {
		String[] parts = s.split(" ");
		StringBuilder text = new StringBuilder();
		switch (request) {
		case 1: {
			System.out.println(text.append(parts[0]).append(" ").append(parts[1].substring(0, 1)).append(".")
					.append(parts[2].substring(0, 1)));
			break;
		}
		case 2: {
			System.out.println(text.append(parts[1]));
			break;
		}
		case 3: {
			System.out.println(text.append(parts[1]).append(" ").append(parts[2]).append(" ").append(parts[0]));
			break;
		}
		default: {
			System.out.println("Wrong request!");
			break;
		}
		}
	}
}
