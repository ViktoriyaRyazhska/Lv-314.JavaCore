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
		displaySurnameInitials(s);
		displayName(s);
		displayNameMiddleSurname(s);
	}

	public static void displaySurnameInitials(String s) {
		String[] parts = s.split(" ");
		StringBuilder text = new StringBuilder();
		text.append(parts[0]).append(" ").append(parts[1].substring(0, 1)).append(".").append(parts[2].substring(0, 1));
		System.out.println(text);
	}

	public static void displayName(String s) {
		String[] parts = s.split(" ");
		System.out.println("Name " + parts[1]);
	}

	public static void displayNameMiddleSurname(String s) {
		String[] parts = s.split(" ");
		System.out.println("Name " + parts[1] + " Middle " + parts[2] + " Surname " + parts[0]);
	}
}
