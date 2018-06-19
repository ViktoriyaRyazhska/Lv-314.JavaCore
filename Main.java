package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 public static void main(String [] arg ) throws NumberFormatException, IOException {
	 System.out.println("Please enter numbver of the task :");
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int k=Integer.parseInt(br.readLine());
	 
	  switch (k) {
      case 1: Fabinachi.fabinachi(6);
               break;
      case 2:  ;
               break;
      case 3:  DollarChange.changeDollar(26, 3000);;
               break;
      case 4:  ;
               break;
      case 5: Polindrome.polindrome("abcha");;
               break;
      case 6:  ;
               break;
      case 7:  ;
               break;
      case 8:  ;
               break;
      case 9:  RandomTask.randome(100);;
               break;
      case 10: ;
               break;
      case 11: ;
               break;
      case 12: ;
               break;
      default: ;
               break;
  }
	 
 }
}
