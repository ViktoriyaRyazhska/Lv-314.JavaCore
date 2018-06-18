package t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Set number of month");
		int month [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int num = Integer.parseInt(br.readLine());
		System.out.println("In "+num+" month "+month[num]+" days");
		

	}

}
