package hwString;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
	String str="Here      is 					 a sentence   with lots   spaces  			 inside";
	
	Pattern p = Pattern.compile("[\\s]+");
	Matcher match =p.matcher(str);
	
	System.out.println(match.replaceAll(" "));
	//--------------------------------------
	String sentence;
	Scanner scn =new Scanner(System.in);
	System.out.println("Enter the sentence with ocurence of dollar amouts of money");
	sentence=scn.nextLine();
	Pattern pat=Pattern.compile("[$][0-9]+[.][0-9]{2}");
	Matcher dolarMatch= pat.matcher(sentence);
	while( dolarMatch.find()) {
		System.out.println(sentence.substring(dolarMatch.start(), dolarMatch.end())+" ");
	}
	

	}

}
