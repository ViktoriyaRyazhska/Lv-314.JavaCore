package L8Home_t1;

/*Enter in the console sentence of five words. 
display the longest word in the sentence
determine the number of its letters
bring the second word in reverse order
*/
public class Main {
	public static void main(String[] args) {
		String text = "The god rabbited";
		String condition_1 = "Show me longest word";
		String condition_2 = "Show me length of longest word";
		String condition_3 = "Ok.Reverse me second word";
		System.out.println(requestForText(text, condition_3));

	}

	public static String requestForText(String s, String condition) {
		String[] word = s.split(" ");
		int longest_word = word[0].length();
		int index_longest_word = 0;
		for (int i = 0; i < word.length; i++) {
			if (longest_word < word[i].length()) {
				longest_word = word[i].length();
				index_longest_word = i;
			}
		}
		if (condition.equals("Show me longest word")) {
			return word[index_longest_word];
		} else if (condition.equals("Show me length of longest word")) {
			return "" + longest_word;
		} else if (condition.equals("Ok.Reverse me second word")) {
			return new StringBuilder(word[1]).reverse().toString();
		} else {
			return "Something went wrong";
		}

	}
}
