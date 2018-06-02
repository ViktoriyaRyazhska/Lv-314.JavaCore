package L8Home_t2;

/*Enter a sentence that contains the words between more than one space. 
 * Convert all spaces, consecutive, one. For example, if we introduce the sentence 
 * "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»
*/
public class Main {

	public static void main(String[] args) {
		String text = "Me  and my   young team are doing something very     important";
		System.out.println(text.replaceAll(" +", " "));
	}
}
