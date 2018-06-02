package L8Home_t1;

/*Enter in the console sentence of five words. 
display the longest word in the sentence
determine the number of its letters
bring the second word in reverse order
*/
public class Main {
	public static void main(String[] args) {
		String text = "Who is duty today standup";
		System.out.println(requestForText(text, 1));
		System.out.println(requestForText(text, 2));
		System.out.println(requestForText(text, 3));
	}

	public static String requestForText(String s, int request) {
		String[] word = s.split(" ");
		int longest_word = word[0].length();
		int pos = 0;
		for (int i = 1; i < word.length; i++) {
			if (longest_word < word[i].length()) {
				longest_word = word[i].length();
				pos = i;
			}
		}
		s = request == 1 ? word[pos]
				: request == 2 ? ("" + longest_word)
						: request == 3 ? new StringBuilder(word[1]).reverse().toString() : "Something went wrong";
		return s;
	}
}
