import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1T2 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is you name?");
		String name = ent.readLine();
		System.out.println("Where do you live:" + name + "?");
		String adress = ent.readLine();
		System.out.println("Name: " + name + " Adress: " + adress);
	}
	}


