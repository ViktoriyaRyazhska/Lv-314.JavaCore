import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Phone {
	int tar = 1;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("¬ведите минуты разговора с первой страной");
    float country1 = Float.parseFloat( br.readLine() );
    System.out.println("¬ведите минуты разговора со второй страной");
    float country2 = Float.parseFloat( br.readLine() );
    System.out.println("¬ведите минуты разговора с третей страной");
    float country3 = Float.parseFloat( br.readLine() );
    System.out.println("–азговор с первой страной стоил "+country1);		
    System.out.println("–азговор со второй страной стоил "+country2);	
    System.out.println("–азговор с третьей страной стоил "+country3);
	}

}