package t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import t1.IsOdd;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		System.out.println("Enter a:");
		a = Integer.parseInt(x.readLine());
		System.out.println("Enter b:");
		b = Integer.parseInt(x.readLine());
		System.out.println("Enter c:");
		c = Integer.parseInt(x.readLine());
		IsOdd.isOdd(a);
		IsOdd.isOdd(b);
		IsOdd.isOdd(c);
		System.out.println(IsOdd.getCount());
	}
}
