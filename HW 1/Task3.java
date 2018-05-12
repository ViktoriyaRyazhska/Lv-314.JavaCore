
public class Task3 {

	public static void main(String[] args) {
		int c1 = 2;
		int c2 = 4;
		int c3 = 6;
		int t1 = 10;
		int t2 = 20;
		int t3 = 30;
		
		int firstcall = c1 + t1;
		System.out.println("First call:" + firstcall);
		int secondcall = c2 + t2;
		System.out.println("Second call:" + secondcall);
		int thirdcall = c3 + t3;
		System.out.println("Third call:" + thirdcall);
		
		System.out.println("All:" + (firstcall + secondcall + thirdcall));
		

	}

}
