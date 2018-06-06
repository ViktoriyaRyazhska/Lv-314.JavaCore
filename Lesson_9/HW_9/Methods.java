import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods {

	public static double div(double a, double b) throws DivException{
		if(b==0){
			throw new DivException("Second nummber is zero");
		}
		return a/b;
	}
	
	public static int readNumber(int start, int end) /*throws ReadNumberException*/{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x=0;
		try{
			int n = Integer.parseInt(br.readLine());
			if(n<end && n>start){
			//	System.out.println(n);
			//	return n;
				x=n;
			}
			else{
				throw new ReadNumberException("Not included in the range");
			}
		}
		catch (NumberFormatException | IOException | ReadNumberException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	return x;
	}
}
