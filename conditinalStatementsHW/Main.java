
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void range(double[] a) {
		for (int i = 0; i < a.length; i++)
			if (5 > a[i] && a[i] > -5) {
				System.out.println(a[i] + " is in a range from -5 to 5 ");
			}

	}

	public static void printMinMax(double[] a) {
		double min = a[0];
		double max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("The minimal value is " + min);
		System.out.println("The maximal value is " + max);

	}

	public static void printErrorType(int errorNumber) {
		HTTPError error;

		switch (errorNumber) {
		case 405:
			error = HTTPError.NotFound;
			break;
		case 406:
			error = HTTPError.MethodNotAllowed;
			break;
		case 407:
			error = HTTPError.NotAcceptable;
			break;
		default:
			error = HTTPError.NotTheCodeOfError;
		}
		System.out.println(error.toSring());
	}

	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// -------------------FIRST TASK
		System.out.println("Enter three values in a row");
		double[] a = new double[3];

		for (int i = 0; i < 3; i++) {
			a[i] = Double.parseDouble(br.readLine());
		}
		Main.range(a);
		Main.printMinMax(a);

		// --------------------THE SECOND TASK
		System.out.println("Enter the number of the error");
		int errorNumber = Integer.parseInt(br.readLine());
		Main.printErrorType(errorNumber);

		// --------------------THE THIRD TASK
		Dog dog1 = new Dog("Sparky", Breed.BULLDOG, 10);
		Dog dog2 = new Dog("Sherman", Breed.BULLDOG, 5);
		Dog dog3 = new Dog("Judy", Breed.GERMANSHEPHERD, 3);
		System.out.println("The  age of the oldest dogs is "+Dog.getOldestDogAge()+ ", and the breed is " + Dog.getOldestDogKind());

	}
}
