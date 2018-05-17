import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H4 {
	private static int count = 0;
	public static void main(String[] args) throws IOException
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		System.out.println("Enter a:");
		a=Integer.parseInt(x.readLine());
		System.out.println("Enter b:");
		b=Integer.parseInt(x.readLine());
		System.out.println("Enter c:");
		c=Integer.parseInt(x.readLine());
	isOdd(a);
	isOdd(b);
	isOdd(c);
	System.out.println(count);
			
		
	}
	public static void isOdd(int number) {
		if(number%2==0) {
			count++;
		}
		else {
			
		}
	}

}
