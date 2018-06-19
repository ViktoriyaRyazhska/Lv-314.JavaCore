import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String input = sc.nextLine();
		do {
			input = input.replace("  ", " ");
		} while (input.contains("  "));
		String s[] = input.split(" ");
		System.out.println(s.length);

	}
}
