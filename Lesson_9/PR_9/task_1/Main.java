package task_1;
public class Main {
	public static void main(String[] args) {

		try {
			System.out.println(Calculate_rectangle.calculate_rectangle(12.4,17));
		}
		catch (RectangleException e) {
		System.err.println(e.getMessage());
		}
		catch (Exception e) {
			System.err.println("Unknown Error");
		}
	}

}
