import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String word = sc.nextLine();
		word.toLowerCase();
		boolean palindrome = true;
		int i1 = 0;
		int i2 = word.length() - 1;
		while (i2 > i1) {
			if (word.charAt(i1) != word.charAt(i2)) {
				palindrome = false;
				break;
			}
			++i1;
			--i2;
		}
		System.out.println(palindrome);
	}

}
