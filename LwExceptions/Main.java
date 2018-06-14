package LwExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int areaRectangle(int a, int b) throws NegativeNumExeption {
		if (a > 0 && b > 0) {
			return a * b;
		} else {
			throw new NegativeNumExeption("a or b is negative");
		}
	}

	public static void main(String[] args) throws IOException {
		try {
			Main.areaRectangle(-5, -9);
		} catch (NegativeNumExeption a) {
			System.out.println(a.getMessage());
		}
		// -------------------------------------------
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Plant[] plant = new Plant[5];
		String Type,Color;
		for (int i = 0; i < 5; i++) {
			
			Type=buf.readLine();
			Color=buf.readLine();
			
			try {
				plant[i] = new Plant(Color, Type, 19);
			} catch (TypeException e) {
				System.out.println(e.getMessage());
			} catch (ColorExceprion e) {
				System.out.println(e.getMessage());
			}
			
		}

	}

}
