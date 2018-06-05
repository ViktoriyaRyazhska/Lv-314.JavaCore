package L9Home_t2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> ar = new ArrayList<>();
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<10;i++) {
			try {
				ar.add(checkRange(Integer.parseInt(read.readLine())));
			}
			catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	public static int checkRange(int number) throws Exception {
		if(1<number&&100>number)
			return number;
		else
			throw new Exception("Outside");
	}

}
